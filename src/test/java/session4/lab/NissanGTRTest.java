package session4.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NissanGTRTest {

    // some constants
    private static final Integer HORSE_POWER_DEFAULT = 570;
    private static final Integer HORSE_POWER_NISMO = 600;
    private static final Integer TORQUE_DEFAULT = 637;
    private static final Integer TORQUE_NISMO = 652;


    @Test
    void getHorsepowerBlack() {
        var gtr = new NissanGTR(NissanGTREditions.BLACK);
        assertEquals(HORSE_POWER_DEFAULT, gtr.getHorsepower());
    }

    @Test
    void getHorsepowerDefault() {
        var gtr = new NissanGTR(NissanGTREditions.DEFAULT);
        assertEquals(HORSE_POWER_DEFAULT, gtr.getHorsepower());
    }

    @Test
    void getHorsepowerNismo() {
        var gtr = new NissanGTR(NissanGTREditions.NISMO);
        assertEquals(HORSE_POWER_NISMO, gtr.getHorsepower());
    }

    @Test
    void getHorsepowerPrestige() {
        var gtr = new NissanGTR(NissanGTREditions.PRESTIGE);
        assertEquals(HORSE_POWER_DEFAULT, gtr.getHorsepower());
    }

    @Test
    void getHorsepowerTrack() {
        var gtr = new NissanGTR(NissanGTREditions.TRACK);
        assertEquals(HORSE_POWER_DEFAULT, gtr.getHorsepower());
    }

    @Test
    void getTorqueBlack() {
        var gtr = new NissanGTR(NissanGTREditions.BLACK);
        assertEquals(TORQUE_DEFAULT, gtr.getTorque());
    }

    @Test
    void getTorqueDefault() {
        var gtr = new NissanGTR(NissanGTREditions.DEFAULT);
        assertEquals(TORQUE_DEFAULT, gtr.getTorque());
    }

    @Test
    void getTorqueNismo() {
        var gtr = new NissanGTR(NissanGTREditions.NISMO);
        assertEquals(TORQUE_NISMO, gtr.getTorque());
    }

    @Test
    void getTorquePrestige() {
        var gtr = new NissanGTR(NissanGTREditions.PRESTIGE);
        assertEquals(TORQUE_DEFAULT, gtr.getTorque());
    }

    @Test
    void getTorqueTrack() {
        var gtr = new NissanGTR(NissanGTREditions.TRACK);
        assertEquals(TORQUE_DEFAULT, gtr.getTorque());
    }

    @Test
    void getColorBlack() {
        var gtr = new NissanGTR(NissanGTREditions.BLACK);
        assertEquals("Black", gtr.getColor());
    }

    @Test
    void getColorDefault() {
        var gtr = new NissanGTR(NissanGTREditions.DEFAULT);
        assertEquals("Orange", gtr.getColor());
    }

    @Test
    void getColorNismo() {
        var gtr = new NissanGTR(NissanGTREditions.NISMO);
        assertEquals("White", gtr.getColor());
    }

    @Test
    void getColorPrestige() {
        var gtr = new NissanGTR(NissanGTREditions.PRESTIGE);
        assertEquals("Dark Orange", gtr.getColor());
    }

    @Test
    void getColor() {
        var gtr = new NissanGTR(NissanGTREditions.TRACK);
        assertEquals("Blue", gtr.getColor());
    }

}