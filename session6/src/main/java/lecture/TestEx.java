package lecture;

/**
 * You can keep throwing an exception down through the methods on the stack.
 *
 * @author Created by tom on 14.10.2018.
 */
class TestEx {
    public static void main(String[] args) {
        doStuff();
    }

    static void doStuff() {
        doMoreStuff();
    }

    static void doMoreStuff() {
        int x = 5 / 0;
    }
}
