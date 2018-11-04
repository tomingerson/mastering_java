

/**
 * @author Created by ergouser on 17.10.18.
 */
public class StackOverflow {

    public static void main(String[] args) {
        calculateFactorial(2);
    }

    private static int calculateFactorial(int number) {
        return number * calculateFactorial(number - 1);
    }
}
