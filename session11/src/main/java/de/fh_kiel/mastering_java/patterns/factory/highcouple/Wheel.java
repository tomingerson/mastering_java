package de.fh_kiel.mastering_java.patterns.factory.highcouple;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * @author Created by tom on 15.11.2018.
 */
class Wheel {

    private final String tire;
    private final String rim;

    Wheel(final String tire, final String rim) {
        this.tire = tire;
        this.rim = rim;
    }

    public String getTire() {
        return tire;
    }

    public String getRim() {
        return rim;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Wheel.class.getSimpleName() + "[", "]")
                .add("tire='" + tire + "'")
                .add("rim='" + rim + "'")
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wheel)) return false;
        Wheel wheel = (Wheel) o;
        return Objects.equals(tire, wheel.tire) &&
                Objects.equals(rim, wheel.rim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tire, rim);
    }
}
