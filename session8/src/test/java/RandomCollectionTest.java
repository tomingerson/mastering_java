import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Created by tom on 20.10.2018.
 */
class RandomCollectionTest {

    @Test
    void collectRandomNumbers() {
        double percentExpected = 50.0;
        Integer[] result = new RandomCollection().collectRandomNumbersArr(percentExpected);
        long count50 = 0L;
        for (int i = 0; i <= result.length - 1; i++) {
            if (result[i] > 50) {
                count50++;
            }
        }
        double quotient = (double) count50 / result.length;
        assertTrue(quotient >= percentExpected / 100.0);
    }
}