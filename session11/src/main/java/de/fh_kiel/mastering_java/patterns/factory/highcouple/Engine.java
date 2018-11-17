package de.fh_kiel.mastering_java.patterns.factory.highcouple;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * Models an engine of a car
 *
 * @author Created by tom on 15.11.2018.
 */
class Engine {

    private final double speed;
    private final double torque;
    private final double power;

    /**
     * Creates a new engine with the given parameters.
     *
     * @param speed  measured in rounds per minute
     * @param torque measured in newton
     * @param power  measured in kilo watt
     */
    Engine(double speed, double torque, double power) {
        this.speed = speed;
        this.torque = torque;
        this.power = power;
    }

    public double getSpeed() {
        return speed;
    }

    public double getTorque() {
        return torque;
    }

    public double getPower() {
        return power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;
        Engine engine = (Engine) o;
        return Double.compare(engine.speed, speed) == 0 &&
                Double.compare(engine.torque, torque) == 0 &&
                Double.compare(engine.power, power) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, torque, power);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Engine.class.getSimpleName() + "[", "]")
                .add("speed=" + speed)
                .add("torque=" + torque)
                .add("power=" + power)
                .toString();
    }
}
