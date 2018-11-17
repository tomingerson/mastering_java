package de.fh_kiel.mastering_java.patterns.factory.highcouple;

import java.util.Objects;
import java.util.StringJoiner;

class Engine {
    private final String rpm;
    private final String torque;
    private final String power;

    Engine(String rpm, String torque, String power) {
        this.rpm = rpm;
        this.torque = torque;
        this.power = power;
    }

    public String getRpm() {
        return rpm;
    }

    public String getTorque() {
        return torque;
    }

    public String getPower() {
        return power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;
        Engine engine = (Engine) o;
        return Objects.equals(rpm, engine.rpm) &&
                Objects.equals(torque, engine.torque) &&
                Objects.equals(power, engine.power);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rpm, torque, power);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Engine.class.getSimpleName() + "[", "]")
                .add("rpm='" + rpm + "'")
                .add("torque='" + torque + "'")
                .add("power='" + power + "'")
                .toString();
    }
}
