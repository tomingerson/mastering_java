package de.fh_kiel.mastering_java.streams.lab;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Created by ergouser on 25.11.18.
 */
public class Person {
    private Gender gender;
    private String lastname;
    private String firstname;

    private Country nationality;
    private String residency;
    private LocalDate birthday;

    private int height;
    private double weight;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Country getNationality() {
        return nationality;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public String getResidency() {
        return residency;
    }

    public void setResidency(String residency) {
        this.residency = residency;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender=" + gender +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", nationality=" + nationality +
                ", residency='" + residency + '\'' +
                ", birthday=" + birthday +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getHeight() == person.getHeight() &&
                Double.compare(person.getWeight(), getWeight()) == 0 &&
                getGender() == person.getGender() &&
                Objects.equals(getLastname(), person.getLastname()) &&
                Objects.equals(getFirstname(), person.getFirstname()) &&
                getNationality() == person.getNationality() &&
                Objects.equals(getResidency(), person.getResidency()) &&
                Objects.equals(getBirthday(), person.getBirthday());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGender(), getLastname(), getFirstname(), getNationality(), getResidency(), getBirthday(), getHeight(), getWeight());
    }
}
