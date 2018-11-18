package de.fh_kiel.mastering_java.patterns.lowcouple;

/**
 * Models a Chassis of a car.
 *
 * @author Created by tom on 18.11.2018.
 */
public interface Chassis {

    Engine getEngine();

    String getTransmission();

    String getDifferential();

    String getSuspension();

}
