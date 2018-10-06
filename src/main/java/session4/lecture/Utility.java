package session4.lecture;

/**
 * Class to demonstrate a Utility class.
 *
 * @author Created by tom on 03.10.2018.
 */
public class Utility {

    public static void main(String... args) {
        for (String arg : args) {
            System.out.println("'" + arg + "' is blank?: " + StringUtils.isBlank(arg));
        }
    }
}

class StringUtils {
    private StringUtils() {
    }

    public static boolean isBlank(String str) {
        return (str == null || str.trim().isEmpty());
    }
}