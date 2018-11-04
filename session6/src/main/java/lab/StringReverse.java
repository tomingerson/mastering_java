package lab;

/**
 * TASK: Create a main method, that catches and handles all of the exceptions:
 * NullPointerException and IllegalArgumentException. Use a finally-block to visualize
 * the trace through the main-method.
 *
 * @author Created by tom on 14.10.2018.
 */
class StringReverse {

    /**
     * Reverses the given input-string.
     *
     * @param input string to reverse
     * @return the reversed input
     * @throws IllegalArgumentException if the input is empty
     * @throws NullPointerException     it the input is {@code null}
     */
    static String reverse(String input) throws IllegalArgumentException, NullPointerException {
        if (input.length() == 0) {
            throw new IllegalArgumentException("input must not be null or empty");
        }
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}
