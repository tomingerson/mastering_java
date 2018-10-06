package session4.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Created by tom on 06.10.2018.
 */
class WeekdayTest {

    @Test
    void name() {
        assertTrue("MONDAY".equalsIgnoreCase(Weekday.MONDAY.name()));
        assertTrue("TUESDAY".equalsIgnoreCase(Weekday.TUESDAY.name()));
        assertTrue("WEDNESDAY".equalsIgnoreCase(Weekday.WEDNESDAY.name()));
        assertTrue("THURSDAY".equalsIgnoreCase(Weekday.THURSDAY.name()));
        assertTrue("FRIDAY".equalsIgnoreCase(Weekday.FRIDAY.name()));
        assertTrue("SATURDAY".equalsIgnoreCase(Weekday.SATURDAY.name()));
        assertTrue("SUNDAY".equalsIgnoreCase(Weekday.SUNDAY.name()));
    }

    @Test
    void ordinal() {
        assertEquals(1, Weekday.MONDAY.ordinal());
        assertEquals(2, Weekday.TUESDAY.ordinal());
        assertEquals(3, Weekday.WEDNESDAY.ordinal());
        assertEquals(4, Weekday.THURSDAY.ordinal());
        assertEquals(5, Weekday.FRIDAY.ordinal());
        assertEquals(6, Weekday.SATURDAY.ordinal());
        assertEquals(0, Weekday.SUNDAY.ordinal());
    }

    @Test
    void values() {
        Weekday[] expected = new Weekday[]{Weekday.SUNDAY, Weekday.MONDAY,
                Weekday.TUESDAY, Weekday.WEDNESDAY, Weekday.THURSDAY, Weekday.FRIDAY,
                Weekday.SATURDAY};
        assertArrayEquals(expected, Weekday.values());
    }
}