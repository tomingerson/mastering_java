package de.fh_kiel.mastering_java.streams.lecture;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Difference in reading files lines with and without streams
 * @author Created by tom on 03.12.2018.
 */
class FileReaderShowcase {
    private static String FILE_NAME = "C:\\Users\\tom\\Entwicklung\\FH_Kiel\\workspace" +
            "\\mastering_java\\session16\\build.gradle";

    List<String> readWithoutStreams() {
        final List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {

            String line = br.readLine();
            while (line != null) {
                list.add(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    List<String> readWithStreamsUnbuffered() {
        try (Stream<String> stream = Files.lines(Paths.get(FILE_NAME))) {
            return stream.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
    List<String> readWithStreamsBuffered() {
        try (BufferedReader br = Files.newBufferedReader(Paths.get(FILE_NAME))) {
            return br.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        FileReaderShowcase fileReaderShowcase = new FileReaderShowcase();
        System.out.println(fileReaderShowcase.readWithoutStreams());
        System.out.println(fileReaderShowcase.readWithStreamsBuffered());
        System.out.println(fileReaderShowcase.readWithStreamsUnbuffered());
    }
}
