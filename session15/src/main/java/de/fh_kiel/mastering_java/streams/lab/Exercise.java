package de.fh_kiel.mastering_java.streams.lab;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Created by tom on 25.11.2018.
 */
class Exercise {

    private Exercise() {
    }

    static void printlnAllPersons(Collection<Person> persons) {
        persons.stream().forEach(System.out::println);
    }

    static void printlnAllPersonsSortedByLastname(Collection<Person> persons) {
        persons.stream().sorted(Comparator.comparing(Person::getLastname)).forEachOrdered(System.out::println);
    }

    static List<String> getAllPersonsLastnamesSortedByLastnameWithoutDuplicates(Collection<Person> persons) {
        return persons.stream().map(Person::getLastname).distinct().sorted().collect(Collectors.toList());
    }

    static boolean areAllPetersFromGermany(Collection<Person> persons) {
        return persons.stream().filter(p -> Objects.equals("Peter", p.getFirstname())).allMatch(p -> Objects.equals(Country.GERMANY, p.getNationality()));
    }

    static List<String> getAllPersonsResidencesSortedWithoutDuplicates(Collection<Person> persons) {
        return persons.stream().map(Person::getResidency).distinct().sorted().collect(Collectors.toList());
    }

    static Optional<Person> findPeterTallerThan(Collection<Person> persons, int height) {
        return persons.stream().filter(p -> Objects.equals("Peter", p.getFirstname())).filter(person -> height < person.getHeight()).findAny();
    }
}