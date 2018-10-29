package session5;

public class FunWithBoxing {

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Integer a = null;
        int b = 5;
        System.out.println(divide(a, b));
    }


}