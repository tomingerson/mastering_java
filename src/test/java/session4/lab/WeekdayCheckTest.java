package session4.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the class {@link WeekdayCheck}.
 *
 * @author Created by tom on 06.10.2018.
 */
class WeekdayCheckTest {

    @Test
    void check() {
        assertEquals("Mondays are bad :-(", new WeekdayCheck(Weekday.MONDAY).check());
        assertEquals("Midweek days are so-so :-|", new WeekdayCheck(Weekday.TUESDAY).check());
        assertEquals("Midweek days are so-so :-|", new WeekdayCheck(Weekday.WEDNESDAY).check());
        assertEquals("Midweek days are so-so :-|", new WeekdayCheck(Weekday.THURSDAY).check());
        assertEquals("Fridays are better :-)", new WeekdayCheck(Weekday.FRIDAY).check());
        assertEquals("Weekends are best :-D", new WeekdayCheck(Weekday.SATURDAY).check());
        assertEquals("Weekends are best :-D", new WeekdayCheck(Weekday.SUNDAY).check());
    }

    @Test
    void isWeekend() {
        assertFalse(WeekdayCheck.isWeekend(Weekday.MONDAY));
        assertFalse(WeekdayCheck.isWeekend(Weekday.TUESDAY));
        assertFalse(WeekdayCheck.isWeekend(Weekday.WEDNESDAY));
        assertFalse(WeekdayCheck.isWeekend(Weekday.THURSDAY));
        assertFalse(WeekdayCheck.isWeekend(Weekday.FRIDAY));

        assertTrue(WeekdayCheck.isWeekend(Weekday.SATURDAY));
        assertTrue(WeekdayCheck.isWeekend(Weekday.SUNDAY));
    }

}