package de.fh_kiel.mastering_java.patterns.highcouple;

import java.util.Objects;
import java.util.StringJoiner;

class NissanGTRNismo {

    private final Chassis chassis = new Chassis("differential", "7000", "657", "441");
    private final Wheel wheel_front_left = new Wheel("255/40ZR20", "10Jx20 ET41");
    // imagina a couple more wheels here ;-)

    public Chassis getChassis() {
        return chassis;
    }

    public Wheel getWheel_front_left() {
        return wheel_front_left;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NissanGTRNismo)) return false;
        NissanGTRNismo that = (NissanGTRNismo) o;
        return Objects.equals(chassis, that.chassis) &&
                Objects.equals(wheel_front_left, that.wheel_front_left);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chassis, wheel_front_left);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", NissanGTRNismo.class.getSimpleName() + "[", "]")
                .add("chassis=" + chassis)
                .add("wheel_front_left=" + wheel_front_left)
                .toString();
    }
}