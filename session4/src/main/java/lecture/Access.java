package lecture;

/**
 * @author Created by tom on 03.10.2018.
 */
public class Access {
}

class Foo {
    int size = 42;

    static void doMore() {
        //int x = size;
    }
}

class Bar {
    static void doMore() {
        //go();
    }

    void go() {
    }
}

class Baz {
    static int count;

    static void woo() {
    }

    static void doMore() {
        woo();
        int x = count;
    }
}