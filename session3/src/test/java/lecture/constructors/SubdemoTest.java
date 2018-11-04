package lecture.constructors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Created by tom on 18.09.2018.
 */
class SubdemoTest {

    @Test
    void testEmptyConstructor() {
        SubDemo sd = new SubDemo();

        assertEquals(Long.valueOf(1L), sd.getValue());
        assertEquals(Long.valueOf(5L), sd.getSubValue());
    }

    @Test
    void testConstructorsUsingParameters() {
        Long val = 32L;
        Long subVal = 64L;
        SubDemo sd = new SubDemo(val, subVal);

        assertEquals(val, sd.getValue());
        assertEquals(subVal, sd.getSubValue());

    }

}