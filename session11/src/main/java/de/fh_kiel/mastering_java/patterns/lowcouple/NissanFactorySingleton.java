package de.fh_kiel.mastering_java.patterns.lowcouple;


import de.fh_kiel.mastering_java.patterns.lowcouple.impl.CarImpl;
import de.fh_kiel.mastering_java.patterns.lowcouple.impl.ChassisImpl;
import de.fh_kiel.mastering_java.patterns.lowcouple.impl.EngineImpl;
import de.fh_kiel.mastering_java.patterns.lowcouple.impl.WheelImpl;

class NissanFactorySingleton {

    private static NissanFactorySingleton INSTANCE;
    private long noOfCarsProduced = 0L;

    private NissanFactorySingleton() {
        // hide the constructor
    }

    static NissanFactorySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new NissanFactorySingleton();
        }
        return INSTANCE;
    }


    Car buildNissanGTR(GTR_Edition edition) {
        Car nissanGTR = null;
        switch (edition) {
            case NISMO:
                nissanGTR = buildNissanGTRNismo();
                break;
            case BLACK:
                nissanGTR = buildNissanGTRBlack();
                break;
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

    public long getNoOfCarsProduced() {
        return noOfCarsProduced;
    }
}
