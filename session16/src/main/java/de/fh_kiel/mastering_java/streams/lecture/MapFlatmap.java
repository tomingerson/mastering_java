package de.fh_kiel.mastering_java.streams.lecture;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Created by tom on 03.12.2018.
 */
public class MapFlatmap {
    private static String FILENAME = "C:\\Users\\tom\\Entwicklung\\FH_Kiel\\workspace" +
            "\\mastering_java\\session16\\build.gradle";

    /**
     * calculates the sum of all lines' lengths
     *
     * @return sum
     * @throws IOException in case file cannot be read
     */
    static int calcLinelengthcount() throws IOException {
        Stream<String> lines = Files.lines(Paths.get(FILENAME));
        IntStream lineLengths = lines.mapToInt(String::length);
        int sum = lineLengths.sum();
        return sum;
    }

    static long calcLinecount() throws IOException {
        Stream<String> lines = Files.lines(Paths.get(FILENAME));
        // matches any character beginning with a unicode letter
        // (ignores punctuation marks and thus matches "words")
        Pattern pattern = Pattern.compile("[^\\p{L}]");
        Stream<Stream<String>> words = lines.map(pattern::splitAsStream);
        long sum = words.count();
        return sum;
    }

    static long calcWordcount() throws IOException {
        Stream<String> lines = Files.lines(Paths.get(FILENAME));
        Pattern pattern = Pattern.compile("[^\\p{L}]");

        Stream<String> words = lines.flatMap(pattern::splitAsStream);

        long sum = words.count();
        return sum;
    }

    public static void main(String[] args) {
        try {
            System.out.println(MapFlatmap.calcLinelengthcount());
            System.out.println(MapFlatmap.calcLinecount());
            System.out.println(MapFlatmap.calcWordcount());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
