package session6.lecture;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Created by tom on 13.10.2018.
 */
class NewtonsLawTest {

    @Test
    void calcAccel_Nullvalues() {
        NewtonsLaw.calculateAcceleration(null, null);
    }

    @Test
    void calcAccel_DivZero() {
        Double accel = NewtonsLaw.calculateAcceleration(12.0, 0.0);
        assertEquals(Double.POSITIVE_INFINITY, accel.doubleValue());
    }
}