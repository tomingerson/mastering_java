package de.fh_kiel.mastering_java.patterns.lab;

import java.util.*;

/**
 * Class to represent a street in a city.
 */
public class ImmutableStreet {

    /**
     * contains all the other streets joining this street
     */
    private final List<ImmutableStreet> joining;

    /**
     * contains the number of the house as key and the height above sealevel as value
     */
    private final Map<Integer, Double> heightProfile;

    private final Integer lowestHouseNumber;
    private final Integer highestHouseNumber;

    private final boolean containsCurve;

    private ImmutableStreet(List<ImmutableStreet> joining, Map<Integer, Double> heightProfile, final Integer lowestHouseNumber, final Integer highestHouseNumber, boolean containsCurve) {
        this.joining = joining;
        this.heightProfile = heightProfile;
        this.lowestHouseNumber = Integer.valueOf(lowestHouseNumber);
        this.highestHouseNumber = Integer.valueOf(highestHouseNumber);
        this.containsCurve = containsCurve;
    }

    public Iterable<ImmutableStreet> getJoining() {
        return Collections.unmodifiableList(joining);
    }

    public ImmutableStreet addJoining(ImmutableStreet corner) {
        List<ImmutableStreet> newJoins = new LinkedList<>(this.joining);
        newJoins.add(corner);
        return new ImmutableStreet(newJoins, this.heightProfile, this.lowestHouseNumber, this.highestHouseNumber, containsCurve);
    }

    public Map<Integer, Double> getHeightProfile() {
        return Collections.unmodifiableMap(heightProfile);
    }

    public ImmutableStreet addHeightProfile(Integer number, Double height) {
        var newHP = new HashMap<>(this.heightProfile);
        newHP.putIfAbsent(number, height);
        return new ImmutableStreet(this.joining, newHP, this.lowestHouseNumber, this.highestHouseNumber, containsCurve);
    }

    public Integer getLowestHouseNumber() {
        return Integer.valueOf(lowestHouseNumber);
    }

    public Integer getHighestHouseNumber() {
        return Integer.valueOf(highestHouseNumber);
    }

    public boolean isContainsCurve() {
        return containsCurve;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ImmutableStreet)) return false;
        ImmutableStreet street = (ImmutableStreet) o;
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
        return new StringJoiner(", ", ImmutableStreet.class.getSimpleName() + "[", "]")
                .add("joining=" + joining)
                .add("heightProfile=" + heightProfile)
                .add("lowestHouseNumber=" + lowestHouseNumber)
                .add("highestHouseNumber=" + highestHouseNumber)
                .add("containsCurve=" + containsCurve)
                .toString();
    }

    class StreetBuilder {
        ImmutableStreet street;
    }

}
