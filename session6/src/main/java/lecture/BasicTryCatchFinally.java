package lecture;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Examples for try-catch-finally and multicatch
 *
 * @author Created by tom on 13.10.2018.
 */
public class BasicTryCatchFinally {

    public static void main(String[] args) {
        System.out.println(readFileContent("c:\\install.log"));
        System.out.println(readFileContent("/tmp/somefile"));
    }

    static String readFileContent(String filename) {
        System.out.println("+++ method started +++");
        try {
            Path file = Paths.get(filename);
            List<String> lines = Files.readAllLines(file);
            System.out.println("+++ file read +++");
            return String.join("\n", lines);
        } catch (NoSuchFileException ex) {
            System.err.println("File not found: " + ex.getMessage());
            ex.printStackTrace();
            return "FILE NOT FOUND";
        } catch (IOException e) {
            // use logger to log exception!
            System.err.println("Exception occured reading a file: " + e.getLocalizedMessage());
            e.printStackTrace();
            return "I/O ERROR";
        } finally {
            System.out.println("+++ method finished +++");
        }
    }

    static void arrayIndexException() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException();
    }

    static void stringIndexException() throws StringIndexOutOfBoundsException {
        throw new StringIndexOutOfBoundsException();
    }

    static void indexException1() {
        try {
            arrayIndexException();
            stringIndexException();
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }

    static void indexException2() {
        try {
            arrayIndexException();
            stringIndexException();
        } catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }
}
