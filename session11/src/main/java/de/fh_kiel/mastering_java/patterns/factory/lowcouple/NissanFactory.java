package de.fh_kiel.mastering_java.patterns.factory.lowcouple;

/**
 * @author Created by ergouser on 16.11.18.
 */
class NissanFactory {
    Car buildNissanGTRNismo() {
        Wheel wf = new Wheel("255/40ZR20", "10Jx20 ET41");
        Wheel wb = new Wheel("285/35ZR20", "10,5Jx20 ET25");
        Engine engine = new Engine(7000L, 652L, 441L);
        Chassis chassis = new Chassis(engine, "transm",
                "diff", "susp");

        return new Car(chassis, wf, wf, wb, wb);
    }

    Car buildNissanGTRBlack() {
        Wheel wf = new Wheel("255/40ZR20", "9.5Jx20 ET45");
        Wheel wb = new Wheel("285/35ZR20", "10,5Jx20 ET25");
        Engine engine = new Engine(7000L, 637L, 419L);
        Chassis chassis = new Chassis(engine, "transm",
                "diff", "susp");

        return new Car(chassis, wf, wf, wb, wb);
    }
}
