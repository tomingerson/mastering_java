package session4.lecture;

/**
 * @author Created by tom on 03.10.2018.
 */
class BigOuter {
    static String out = "hi";

    static class Nest {
        void go() {
            System.out.println(BigOuter.out);
        }
    }
}

class Broom {
    public static void main(String[] args) {
        BigOuter.Nest n = new BigOuter.Nest();
        n.go();
        B2 b2 = new B2();
        b2.go();
    }

    static class B2 {
        void go() {
            System.out.println("hi 2");
        }
    }
}
