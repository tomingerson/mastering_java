package lecture;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author Created by tom on 13.10.2018.
 */
class NewtonsLawTest {

    @Test
    void calcAccel_Nullvalues() {
        assertThrows(NullPointerException.class,
                () -> NewtonsLaw.calculateAcceleration(null, null));
    }

    @Test
    void calcAccel_DivZero() {
        assertEquals(Double.POSITIVE_INFINITY, NewtonsLaw.calculateAcceleration(12.0,
                0.0).doubleValue());
    }
}