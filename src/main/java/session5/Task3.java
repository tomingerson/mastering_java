package session5;

/**
 * @author Created by ergouser on 10.10.18.
 */
public class Task3 {
    public static String longest(String... strings) {
        var longest = "";
        for (String string : strings) {
            if (longest.length() < string.length()) {
                longest = string;
            }
        }
        return longest;
    }
}
