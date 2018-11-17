package de.fh_kiel.mastering_java.patterns.factory.highcouple;

/**
 * @author Created by tom on 15.11.2018.
 */
public class Main {

    public static void main(String[] args) {
        Wheel wf = new Wheel("255/40ZR20", "10Jx20 ET41");
        Wheel wb = new Wheel("285/35ZR20", "10,5Jx20 ET25");

        Car nissan_gtr = new Car(new Chassis(new Engine(7000.0, 652.0, 441), "transm",
                "diff", "susp"), wf, wf, wb, wb);

        System.out.println(nissan_gtr);
    }
}
