package de.fh_kiel.mastering_java.patterns.lab;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Class to represent a street in a city.
 */
public class Street {

    /** contains all the other streets joining this street */
    private final List<Street> joining = new LinkedList<>();

    /** contains the number of the house as key and the height above sealevel as value */
    private final Map<Integer, Double> heightProfile = new HashMap<>();

    private Integer lowestHouseNumber;
    private Integer highestHouseNumber;

    private boolean containsCurve;

    public Street(Integer lowestHouseNumber, Integer highestHouseNumber) {
        this.lowestHouseNumber = lowestHouseNumber;
        this.highestHouseNumber = highestHouseNumber;
    }

    public Iterable<Street> getJoining() {
        return joining;
    }

    public void addJoining(Street corner) {
        this.joining.add(corner);
    }

    public Map<Integer, Double> getHeightProfile() {
        return heightProfile;
    }

    public void addHeightProfile(Integer number, Double height) {
        this.heightProfile.putIfAbsent(number, height);
    }

    public Integer getLowestHouseNumber() {
        return lowestHouseNumber;
    }

    public void setLowestHouseNumber(Integer lowestHouseNumber) {
        this.lowestHouseNumber = lowestHouseNumber;
    }

    public Integer getHighestHouseNumber() {
        return highestHouseNumber;
    }

    public void setHighestHouseNumber(Integer highestHouseNumber) {
        this.highestHouseNumber = highestHouseNumber;
    }

    public boolean isContainsCurve() {
        return containsCurve;
    }

    public void setContainsCurve(boolean containsCurve) {
        this.containsCurve = containsCurve;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Street)) return false;
        Street street = (Street) o;
        return containsCurve == street.containsCurve &&
                Objects.equals(joining, street.joining) &&
                Objects.equals(heightProfile, street.heightProfile) &&
                Objects.equals(lowestHouseNumber, street.lowestHouseNumber) &&
                Objects.equals(highestHouseNumber, street.highestHouseNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(joining, heightProfile, lowestHouseNumber, highestHouseNumber, containsCurve);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Street.class.getSimpleName() + "[", "]")
                .add("joining=" + joining)
                .add("heightProfile=" + heightProfile)
                .add("lowestHouseNumber=" + lowestHouseNumber)
                .add("highestHouseNumber=" + highestHouseNumber)
                .add("containsCurve=" + containsCurve)
                .toString();
    }
}
