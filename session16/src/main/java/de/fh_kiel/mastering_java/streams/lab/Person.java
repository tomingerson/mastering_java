package de.fh_kiel.mastering_java.streams.lab;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.StringJoiner;

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

    private Set<String> citiesLivedIn = new HashSet<>();

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

    public boolean addCityLivedIn(String city) {
        return this.citiesLivedIn.add(city);
    }

    public boolean removeCityLivedIn(String city) {
        return this.citiesLivedIn.remove(city);
    }

    public Set<String> getCitiesLivedIn() {
        return citiesLivedIn;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("gender=" + gender)
                .add("lastname='" + lastname + "'")
                .add("firstname='" + firstname + "'")
                .add("nationality=" + nationality)
                .add("residency='" + residency + "'")
                .add("birthday=" + birthday)
                .add("citiesLivedIn=" + citiesLivedIn)
                .add("height=" + height)
                .add("weight=" + weight)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return height == person.height &&
                Double.compare(person.weight, weight) == 0 &&
                gender == person.gender &&
                Objects.equals(lastname, person.lastname) &&
                Objects.equals(firstname, person.firstname) &&
                nationality == person.nationality &&
                Objects.equals(residency, person.residency) &&
                Objects.equals(birthday, person.birthday) &&
                Objects.equals(citiesLivedIn, person.citiesLivedIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, lastname, firstname, nationality, residency, birthday, citiesLivedIn, height, weight);
    }


    static final class PersonBuilder {
        private Gender gender;
        private String lastname;
        private String firstname;
        private Country nationality;
        private String residency;
        private LocalDate birthday;
        private Set<String> citiesLivedIn = new HashSet<>();
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

        PersonBuilder withCityLivedIn(String cityLivedIn) {
            this.citiesLivedIn.add(cityLivedIn);
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
            person.citiesLivedIn.addAll(this.citiesLivedIn);
            return person;
        }
    }
}
