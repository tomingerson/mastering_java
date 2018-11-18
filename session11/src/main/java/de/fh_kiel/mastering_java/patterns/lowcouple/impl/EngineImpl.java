package de.fh_kiel.mastering_java.patterns.lowcouple.impl;

import de.fh_kiel.mastering_java.patterns.lowcouple.Engine;

import java.util.Objects;
import java.util.StringJoiner;

public class EngineImpl implements Engine {

    private final long speed;
    private final long torque;
    private final long power;

    /**
     * Creates a new engine with the given parameters.
     *
     * @param speed  measured in rounds per minute
     * @param torque measured in newton
     * @param power  measured in kilo watt
     */
    public EngineImpl(long speed, long torque, long power) {
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
        if (!(o instanceof EngineImpl)) return false;
        EngineImpl engine = (EngineImpl) o;
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
        return new StringJoiner(", ", EngineImpl.class.getSimpleName() + "[", "]")
                .add("speed=" + speed)
                .add("torque=" + torque)
                .add("power=" + power)
                .toString();
    }
}
