package de.fh_kiel.mastering_java.patterns.lowcouple.impl;

import de.fh_kiel.mastering_java.patterns.lowcouple.Chassis;
import de.fh_kiel.mastering_java.patterns.lowcouple.Engine;

import java.util.Objects;
import java.util.StringJoiner;


public class ChassisImpl implements Chassis {
    private final Engine engine;
    private final String transmission;
    private final String differential;
    private final String suspension;

    public ChassisImpl(final Engine engine, final String transmission,
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
        if (!(o instanceof ChassisImpl)) return false;
        ChassisImpl chassis = (ChassisImpl) o;
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
        return new StringJoiner(", ", ChassisImpl.class.getSimpleName() + "[", "]")
                .add("engine=" + engine)
                .add("transmission='" + transmission + "'")
                .add("differential='" + differential + "'")
                .add("suspension='" + suspension + "'")
                .toString();
    }
}
