package session6.lecture;

/**
 * Demo of a NullPointerException and StackOverflowError
 *
 * @author Created by tom on 15.10.2018.
 */
public class NPE {
    private static String s;

    static void go() {
        go();
    }

    public static void main(String[] args) {
        //go();
        System.out.println(s.length());
    }
}
