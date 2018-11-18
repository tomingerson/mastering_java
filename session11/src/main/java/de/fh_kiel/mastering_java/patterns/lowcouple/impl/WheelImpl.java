package de.fh_kiel.mastering_java.patterns.lowcouple.impl;

import de.fh_kiel.mastering_java.patterns.lowcouple.Wheel;

import java.util.Objects;
import java.util.StringJoiner;

public class WheelImpl implements Wheel {

    private final String tire;
    private final String rim;
    private final int numberOfBolts;
    private final double maxPressure;


    public WheelImpl(final String tire, final String rim) {
        this(tire, rim, 5, 2.1);
    }

    public WheelImpl(String tire, String rim, int numberOfBolts, double maxPressure) {
        this.tire = tire;
        this.rim = rim;
        this.numberOfBolts = numberOfBolts;
        this.maxPressure = maxPressure;
    }

    public String getTire() {
        return tire;
    }

    public String getRim() {
        return rim;
    }

    public int getNumberOfBolts() {
        return numberOfBolts;
    }

    public double getMaxPressure() {
        return maxPressure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WheelImpl)) return false;
        WheelImpl wheel = (WheelImpl) o;
        return numberOfBolts == wheel.numberOfBolts &&
                Double.compare(wheel.maxPressure, maxPressure) == 0 &&
                Objects.equals(tire, wheel.tire) &&
                Objects.equals(rim, wheel.rim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tire, rim, numberOfBolts, maxPressure);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", WheelImpl.class.getSimpleName() + "[", "]")
                .add("tire='" + tire + "'")
                .add("rim='" + rim + "'")
                .add("numberOfBolts=" + numberOfBolts)
                .add("maxPressure=" + maxPressure)
                .toString();
    }
}
