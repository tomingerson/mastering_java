package de.fh_kiel.mastering_java.patterns.factory.highcouple;

import java.util.Objects;
import java.util.StringJoiner;

class Chassis {
    private final String differential;
    private final Engine enginge;

    Chassis(String differential, String rpm, String torque, String power) {
        this.differential = differential;
        this.enginge = new Engine(rpm, torque, power);
    }

    public String getDifferential() {
        return differential;
    }

    public Engine getEnginge() {
        return enginge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chassis)) return false;
        Chassis chassis = (Chassis) o;
        return Objects.equals(differential, chassis.differential) &&
                Objects.equals(enginge, chassis.enginge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(differential, enginge);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Chassis.class.getSimpleName() + "[", "]")
                .add("differential='" + differential + "'")
                .add("enginge=" + enginge)
                .toString();
    }
}
