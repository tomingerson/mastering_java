package session5;

/**
 * @author Created by ergouser on 10.10.18.
 */
public class Task2 {
    public static long sum(long... summands) {

        if (summands.length <= 10) {
            long sum = 0L;
            for (long summand : summands) {
                sum += summand;
            }
            return sum;
        }

        return -1L;
    }
}
