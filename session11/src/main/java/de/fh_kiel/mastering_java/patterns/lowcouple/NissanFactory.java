package de.fh_kiel.mastering_java.patterns.lowcouple;

import de.fh_kiel.mastering_java.patterns.lowcouple.impl.CarImpl;
import de.fh_kiel.mastering_java.patterns.lowcouple.impl.ChassisImpl;
import de.fh_kiel.mastering_java.patterns.lowcouple.impl.EngineImpl;
import de.fh_kiel.mastering_java.patterns.lowcouple.impl.WheelImpl;

/**
 * @author Created by ergouser on 16.11.18.
 */
class NissanFactory {

    private static long noOfCarsProduced = 0;

    public static long getNoOfCarsProduced() {
        return noOfCarsProduced;
    }

    Car buildNissanGTR(GTR_Edition edition) {
        Car nissanGTR = null;
        switch (edition) {
            case NISMO:
                nissanGTR = buildNissanGTRNismo();
            case BLACK:
                nissanGTR = buildNissanGTRBlack();
        }
        return nissanGTR;
    }

    private Car buildNissanGTRNismo() {
        Wheel wf = new WheelImpl("255/40ZR20", "10Jx20 ET41");
        Wheel wb = new WheelImpl("285/35ZR20", "10,5Jx20 ET25");
        Engine engine = new EngineImpl(7000L, 652L, 441L);
        Chassis chassis = new ChassisImpl(engine, "transm",
                "diff", "susp");

        noOfCarsProduced++;
        return new CarImpl(chassis, wf, wf, wb, wb);
    }

    private Car buildNissanGTRBlack() {
        Wheel wf = new WheelImpl("255/40ZR20", "9.5Jx20 ET45");
        Wheel wb = new WheelImpl("285/35ZR20", "10,5Jx20 ET25");
        Engine engine = new EngineImpl(7000L, 637L, 419L);
        Chassis chassis = new ChassisImpl(engine, "transm",
                "diff", "susp");

        noOfCarsProduced++;
        return new CarImpl(chassis, wf, wf, wb, wb);
    }
}


