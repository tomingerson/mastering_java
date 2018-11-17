package de.fh_kiel.mastering_java.patterns.factory.highcouple;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * Models the chassis of a car.
 *
 * @author Created by tom on 15.11.2018.
 */
public class Chassis {
    private final Engine engine;
    private final String transmission;
    private final String differential;
    private final String suspension;

    Chassis(final Engine engine, final String transmission,
            final String differential, final String suspension) {
        this.engine = engine;
        this.transmission = transmission;
        this.differential = differential;
        this.suspension = suspension;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getDifferential() {
        return differential;
    }

    public String getSuspension() {
        return suspension;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chassis)) return false;
        Chassis chassis = (Chassis) o;
        return Objects.equals(engine, chassis.engine) &&
                Objects.equals(transmission, chassis.transmission) &&
                Objects.equals(differential, chassis.differential) &&
                Objects.equals(suspension, chassis.suspension);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, transmission, differential, suspension);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Chassis.class.getSimpleName() + "[", "]")
                .add("engine=" + engine)
                .add("transmission='" + transmission + "'")
                .add("differential='" + differential + "'")
                .add("suspension='" + suspension + "'")
                .toString();
    }
}
