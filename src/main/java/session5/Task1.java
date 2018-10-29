package session5;

/**
 * @author Created by ergouser on 10.10.18.
 */
public class Task1 {

    public static int sumV1(int... summands) {
        int sum = 0;
        for (int i = 0; i < summands.length; i++) {
            sum += summands[i];
        }
        return sum;
    }

    public static int sumV2(int... summands) {
        int sum = 0;
        for (int summand : summands) {
            sum += summand;
        }
        return sum;
    }

    public static int sumV3(int... summands) {

        int sum = 0;
        if (summands != null) {
            for (int summand : summands) {
                sum += summand;
            }
        }
        return sum;
    }

    public static int sumV4(Integer... summands) {

        int sum = 0;
        if (summands != null) {
            for (Integer summand : summands) {
                if (summand != null) {
                    sum += summand;
                }
            }
        }
        return sum;
    }
}
