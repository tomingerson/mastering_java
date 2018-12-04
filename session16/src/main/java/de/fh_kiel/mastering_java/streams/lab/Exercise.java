package de.fh_kiel.mastering_java.streams.lab;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Exercise for session 16: Streams II
 *
 * @author Created by tom on 04.12.2018.
 */
class Exercise {

    static OptionalInt getHeightOfPersonInTheMiddle(List<Person> persons) {
        // not possible in one line (?)
        int size = persons.size();
        return persons.stream()
                .mapToInt(Person::getHeight)
                .sorted()
                .skip(size / 2L)
                .findFirst();
    }

    static OptionalDouble getAverageHeightOfGermanPersons(List<Person> persons) {
        return persons.stream()
                .mapToInt(Person::getHeight)
                .average();
    }

    static List<String> getAllUniqueCitynamesAnyPersonEverLivedIn(List<Person> persons) {
        // use flatMap
        return persons.stream()
                .flatMap(person -> person.getCitiesLivedIn().stream())
                .distinct()
                .collect(Collectors.toList());
    }

    static DoubleSummaryStatistics getSummaryStatisticsOnPersonsWeights(List<Person> persons) {
        return persons.stream()
                .mapToDouble(Person::getWeight)
                .summaryStatistics();
    }

    static List<Integer> generatePowersOf2Between16And256() {
        // use iterate to create the stream
        return Stream.iterate(2, i -> 2 * i)
                .skip(3L)
                .limit(5L)
                .collect(Collectors.toList());
    }

    static Map<Boolean, List<Integer>> partitionListByEvenAndOdd(List<Integer> numbers) {
        return numbers.stream()
                .filter(Objects::nonNull)
                .collect(
                        Collectors.partitioningBy(i -> i % 2 == 0)
                );
    }

    static Map<Character, List<Person>> groupPersonsByFirstLetterOfLastname(List<Person> persons) {
        return persons.stream()
                .collect(
                        Collectors.groupingBy(person -> person.getLastname().charAt(0))
                );
    }

    static Map<Character, List<Gender>> groupPersonsgenderByFirstLetterOfLastname(List<Person> persons) {
        return persons.stream()
                .collect(
                        Collectors.groupingBy(
                                person -> person.getLastname().charAt(0),
                                Collectors.mapping(
                                        Person::getGender,
                                        Collectors.toList()
                                )
                        )
                );
    }

    static List<Person> allPersonsWithTheSameLastname(List<Person> persons) {
        // use groupingBy Lastname and stream the result
        return persons.stream()
                .collect(
                        Collectors.groupingBy(Person::getLastname, Collectors.toList())
                )
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() > 1)
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.toList());
    }
}
