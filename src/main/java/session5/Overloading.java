package session5;

/**
 * @author Created by ergouser on 10.10.18.
 */
public class Overloading {

    static void println(Object o) {
        System.out.println(o);
    }

    public static void method(short i) {
        println("A");
    }

    public static void method(Short i) {
        println("B");
    }

    public static void method(int... i) {
        println("C");
    }

    public static void method(Integer... i) {
        println("D");
    }

    public static void method(long l) {
        println("E");
    }

    public static void method(Long l) {
        println("F");
    }

    public static void method(long... l) {
        println("G");
    }

    public static void method(Object o) {
        println("H");
    }

    public static void main(String[] args) {
        Byte bb = Byte.valueOf("8");
        byte sb = 8;
        Integer bi = 2;
        int si = 2;
        Long bl = 2L;
        long sl = 2L;

        method(si);
        method(bi);
        // method(bi, bi);
        method(bb);
        method(sb);
        method(sl);
        method(bl);
        method(bl, bl);
        method(bi, bl);
    }
}
