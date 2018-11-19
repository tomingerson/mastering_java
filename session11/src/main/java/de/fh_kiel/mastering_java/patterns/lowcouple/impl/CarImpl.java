package de.fh_kiel.mastering_java.patterns.lowcouple.impl;

import de.fh_kiel.mastering_java.patterns.lowcouple.Car;
import de.fh_kiel.mastering_java.patterns.lowcouple.Chassis;
import de.fh_kiel.mastering_java.patterns.lowcouple.Wheel;

import java.util.Objects;
import java.util.StringJoiner;

public class CarImpl implements Car {

    private final Chassis chassis;
    private final Wheel wheel_front_left;
    private final Wheel wheel_front_right;
    private final Wheel wheel_back_left;
    private final Wheel wheel_back_right;

    public CarImpl(final Chassis chassis, final Wheel wheel_front_left,
                   final Wheel wheel_front_right, final Wheel wheel_back_left,
                   final Wheel wheel_back_right) {
        this.chassis = chassis;
        this.wheel_front_left = wheel_front_left;
        this.wheel_front_right = wheel_front_right;
        this.wheel_back_left = wheel_back_left;
        this.wheel_back_right = wheel_back_right;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public Wheel getWheel_front_left() {
        return wheel_front_left;
    }

    public Wheel getWheel_front_right() {
        return wheel_front_right;
    }

    public Wheel getWheel_back_left() {
        return wheel_back_left;
    }

    public Wheel getWheel_back_right() {
        return wheel_back_right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarImpl)) return false;
        CarImpl car = (CarImpl) o;
        return Objects.equals(chassis, car.chassis) &&
                Objects.equals(wheel_front_left, car.wheel_front_left) &&
                Objects.equals(wheel_front_right, car.wheel_front_right) &&
                Objects.equals(wheel_back_left, car.wheel_back_left) &&
                Objects.equals(wheel_back_right, car.wheel_back_right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chassis, wheel_front_left, wheel_front_right,
                wheel_back_left, wheel_back_right);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CarImpl.class.getSimpleName() + "[", "]")
                .add("chassis=" + chassis)
                .add("wheel_front_left=" + wheel_front_left)
                .add("wheel_front_right=" + wheel_front_right)
                .add("wheel_back_left=" + wheel_back_left)
                .add("wheel_back_right=" + wheel_back_right)
                .toString();
    }
}
