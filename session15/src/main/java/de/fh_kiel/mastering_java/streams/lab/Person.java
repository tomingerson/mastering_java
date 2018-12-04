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

    Gender getGender() {
        return gender;
    }

    void setGender(Gender gender) {
        this.gender = gender;
    }

    String getLastname() {
        return lastname;
    }

    void setLastname(String lastname) {
        this.lastname = lastname;
    }

    String getFirstname() {
        return firstname;
    }

    void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    Country getNationality() {
        return nationality;
    }

    void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    String getResidency() {
        return residency;
    }

    void setResidency(String residency) {
        this.residency = residency;
    }

    LocalDate getBirthday() {
        return birthday;
    }

    void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    int getHeight() {
        return height;
    }

    void setHeight(int height) {
        this.height = height;
    }

    double getWeight() {
        return weight;
    }

    void setWeight(double weight) {
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

    static final class PersonBuilder {
        private Gender gender;
        private String lastname;
        private String firstname;
        private Country nationality;
        private String residency;
        private LocalDate birthday;
        private int height;
        private double weight;

        private PersonBuilder() {
        }

        static PersonBuilder aPerson() {
            return new PersonBuilder();
        }

        PersonBuilder withGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        PersonBuilder withLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        PersonBuilder withFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        PersonBuilder withNationality(Country nationality) {
            this.nationality = nationality;
            return this;
        }

        PersonBuilder withResidency(String residency) {
            this.residency = residency;
            return this;
        }

        PersonBuilder withBirthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        PersonBuilder withHeight(int height) {
            this.height = height;
            return this;
        }

        PersonBuilder withWeight(double weight) {
            this.weight = weight;
            return this;
        }

        Person build() {
            Person person = new Person();
            person.setGender(gender);
            person.setLastname(lastname);
            person.setFirstname(firstname);
            person.setNationality(nationality);
            person.setResidency(residency);
            person.setBirthday(birthday);
            person.setHeight(height);
            person.setWeight(weight);
            return person;
        }
    }
}
