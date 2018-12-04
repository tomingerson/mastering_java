package de.fh_kiel.mastering_java.streams.lab;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;

/**
 * Exercise for session 16: Streams II
 *
 * @author Created by tom on 04.12.2018.
 */
class Exercise {

    static OptionalInt getHeightOfPersonInTheMiddle(List<Person> persons) {
        // not possible in one line (?)
        throw new UnsupportedOperationException("Not yet implemented");
    }

    static OptionalDouble getAverageHeightOfGermanPersons(List<Person> persons) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    static List<String> getAllUniqueCitynamesAnyPersonEverLivedIn(List<Person> persons) {
        // use flatMap
        throw new UnsupportedOperationException("Not yet implemented");
    }

    static DoubleSummaryStatistics getSummaryStatisticsOnPersonsWeights(List<Person> persons) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    static List<Integer> generatePowersOf2Between16And256() {
        // use iterate to create the stream
        throw new UnsupportedOperationException("Not yet implemented");
    }

    static Map<Boolean, List<Integer>> partitionListByEvenAndOdd(List<Integer> numbers) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    static Map<Character, List<Person>> groupPersonsByFirstLetterOfLastname(List<Person> persons) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    static Map<Character, List<Gender>> groupPersonsgenderByFirstLetterOfLastname(List<Person> persons) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    static List<Person> allPersonsWithTheSameLastname(List<Person> persons) {
        // use groupingBy Lastname and stream the result
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
