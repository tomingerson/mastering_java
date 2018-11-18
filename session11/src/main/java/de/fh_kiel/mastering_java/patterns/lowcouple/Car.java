package de.fh_kiel.mastering_java.patterns.lowcouple;

/**
 * Models a Car consisting of a Chassis and four Wheels
 *
 * @author Created by tom on 18.11.2018.
 */
public interface Car {

    Chassis getChassis();

    Wheel getWheel_front_left();

    Wheel getWheel_front_right();

    Wheel getWheel_back_left();

    Wheel getWheel_back_right();

}
