package de.fh_kiel.mastering_java.streams.lab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;

import static de.fh_kiel.mastering_java.streams.lab.Person.PersonBuilder.aPerson;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Many more tests for Streams.
 *
 * @author Created by tom on 04.12.2018.
 */
class ExerciseTest {

    private List<Person> persons;

    private Person peterPerson;
    private Person maryamPerson;
    private Person aaravPerson;
    private Person benPerson;


    @BeforeEach
    void setUp() {

        maryamPerson = aPerson().withFirstname("Maryam").withLastname("Bonddopaddhay")
                .withGender(Gender.FEMALE).withNationality(Country.BANGLADESH)
                .withResidency("Berlin").withBirthday(LocalDate.of(1998, 4, 1))
                .withHeight(169).withWeight(62.3).withCityLivedIn("Berlin").withCityLivedIn("Dhaka").build();

        aaravPerson = aPerson().withFirstname("Aarav").withLastname("Nehru")
                .withGender(Gender.MALE).withNationality(Country.INDIA)
                .withResidency("Mumbai").withBirthday(LocalDate.of(1997, 12, 19))
                .withHeight(172).withWeight(82.7).withCityLivedIn("Mumbai").withCityLivedIn("Bangalore").build();

        peterPerson = aPerson().withFirstname("Peter").withLastname("Müller")
                .withGender(Gender.MALE).withNationality(Country.GERMANY)
                .withResidency("Köln").withBirthday(LocalDate.of(1999, 1, 13))
                .withHeight(181).withWeight(87.8).withCityLivedIn("Köln").withCityLivedIn("Berlin").build();

        benPerson = aPerson().withFirstname("Ben").withLastname("Müller")
                .withGender(Gender.NONBINARY).withNationality(Country.GERMANY)
                .withResidency("Berlin").withBirthday(LocalDate.of(1998, 8, 28))
                .withHeight(191).withWeight(81.2).withCityLivedIn("Berlin").withCityLivedIn("Sydney").build();

        persons = List.of(
                maryamPerson,
                aaravPerson,
                peterPerson,
                benPerson);
    }

    @AfterEach
    void tearDown() {
        persons = null;
    }


    @Test
    @DisplayName("Peter has middle height")
    void testGetHeightOfPersonInTheMiddle() {
        OptionalInt empty =
                Exercise.getHeightOfPersonInTheMiddle(Collections.emptyList());
        assertFalse(empty.isPresent());

        OptionalInt middle = Exercise.getHeightOfPersonInTheMiddle(persons);
        assertTrue(middle.isPresent());
        assertEquals(181, middle.getAsInt());
    }

    @Test
    @DisplayName("AverageHeight is 122")
    void testGetAverageHeightOfGermanPersons() {
        OptionalDouble empty = Exercise.getAverageHeightOfGermanPersons(Collections.emptyList());
        assertFalse(empty.isPresent());

        OptionalDouble avg = Exercise.getAverageHeightOfGermanPersons(persons);
        assertTrue(avg.isPresent());
        assertEquals(178.25, avg.getAsDouble());
    }

    @Test
    @DisplayName("all Cities are listed")
    void testGetAllUniqueCitynamesAnyPersonEverLivedIn() {
        List<String> expected = List.of("Berlin", "Dhaka", "Mumbai", "Bangalore", "Köln", "Sydney");
        List<String> actual = Exercise.getAllUniqueCitynamesAnyPersonEverLivedIn(persons);
        assertTrue(actual.containsAll(expected));
        assertEquals(6, actual.size());
    }

    @Test
    @DisplayName("Statistics are never wrong")
    void testGetSummaryStatisticsOnPersonsWeights() {
        DoubleSummaryStatistics actual =
                Exercise.getSummaryStatisticsOnPersonsWeights(persons);

        assertEquals(78.5, actual.getAverage());
        assertEquals(4L, actual.getCount());
        assertEquals(87.8, actual.getMax());
        assertEquals(62.3, actual.getMin());
        assertEquals(314.0, actual.getSum());
    }

    @Test
    @DisplayName("many powers")
    void testGeneratePowersOf2Between16And256() {
        List<Integer> expected = List.of(16, 32, 64, 128, 256);
        List<Integer> actual = Exercise.generatePowersOf2Between16And256();

        assertTrue(actual.containsAll(expected));
        assertEquals(5, actual.size());
    }

    @Test
    @DisplayName("even seems odd")
    void testPartitionListByEvenAndOdd() {
        assertEquals(2,
                Exercise.partitionListByEvenAndOdd(Collections.emptyList()).size());
        assertEquals(0,
                Exercise.partitionListByEvenAndOdd(Collections.emptyList()).get(true).size());
        assertEquals(0,
                Exercise.partitionListByEvenAndOdd(Collections.emptyList()).get(false).size());

        Map<Boolean, List<Integer>> allOdd =
                Exercise.partitionListByEvenAndOdd(List.of(1, 5));
        assertEquals(0, allOdd.get(true).size());
        assertEquals(2, allOdd.get(false).size());
        assertTrue(allOdd.get(false).containsAll(List.of(1, 5)));

        Map<Boolean, List<Integer>> mixed =
                Exercise.partitionListByEvenAndOdd(List.of(1, 2, 5));
        assertEquals(1, mixed.get(true).size());
        assertTrue(mixed.get(true).contains(2));
        assertEquals(2, mixed.get(false).size());
        assertTrue(mixed.get(false).containsAll(List.of(1, 5)));
    }

    @Test
    @DisplayName("Lastname personregister")
    void testGroupPersonsByFirstLetterOfLastname() {
        Map<Character, List<Person>> actual =
                Exercise.groupPersonsByFirstLetterOfLastname(persons);

        assertEquals(3, actual.keySet().size());
        assertTrue(actual.get('B').contains(maryamPerson));
        assertTrue(actual.get('N').contains(aaravPerson));
        assertTrue(actual.get('M').containsAll(List.of(benPerson, peterPerson)));

    }

    @Test
    @DisplayName("Lastname register of gender")
    void testGroupPersonsgenderByFirstLetterOfLastname() {
        Map<Character, List<Gender>> actual =
                Exercise.groupPersonsgenderByFirstLetterOfLastname(persons);

        assertEquals(3, actual.keySet().size());
        assertTrue(actual.get('B').contains(Gender.FEMALE));
        assertTrue(actual.get('N').contains(Gender.MALE));
        assertTrue(actual.get('M').containsAll(List.of(Gender.MALE, Gender.NONBINARY)));
    }

    @Test
    @DisplayName("Only Müller is a duplicate lastname")
    void testAllPersonsWithTheSameLastname() {
        List<Person> expected = List.of(benPerson, peterPerson);
        List<Person> actual = Exercise.allPersonsWithTheSameLastname(persons);

        assertTrue(actual.containsAll(expected));
        assertEquals(2, actual.size());
    }
}