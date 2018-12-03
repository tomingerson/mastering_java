package de.fh_kiel.mastering_java.streams.lab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static de.fh_kiel.mastering_java.streams.lab.Person.PersonBuilder.aPerson;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExerciseTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private Collection<Person> persons;
    private Person peterPerson;
    private String maryam;
    private String aarav;
    private String peter;
    private String ben;

    @BeforeEach
    void setUp() {

        Person maryam = aPerson().withFirstname("Maryam").withLastname("Bonddopaddhay")
                .withGender(Gender.FEMALE).withNationality(Country.BANGLADESH)
                .withResidency("Berlin").withBirthday(LocalDate.of(1998, 4, 1))
                .withHeight(169).withWeight(62.3).build();
        this.maryam = maryam.toString();

        Person aarav = aPerson().withFirstname("Aarav").withLastname("Nehru")
                .withGender(Gender.MALE).withNationality(Country.INDIA)
                .withResidency("Mumbai").withBirthday(LocalDate.of(1997, 12, 19))
                .withHeight(172).withWeight(82.7).build();
        this.aarav = aarav.toString();

        this.peterPerson = aPerson().withFirstname("Peter").withLastname("Müller")
                .withGender(Gender.MALE).withNationality(Country.GERMANY)
                .withResidency("Köln").withBirthday(LocalDate.of(1999, 1, 13))
                .withHeight(181).withWeight(87.8).build();
        this.peter = peterPerson.toString();

        Person ben = aPerson().withFirstname("Ben").withLastname("Müller")
                .withGender(Gender.NONBINARY).withNationality(Country.GERMANY)
                .withResidency("Berlin").withBirthday(LocalDate.of(1998, 8, 28))
                .withHeight(191).withWeight(81.2).build();
        this.ben = ben.toString();

        persons = List.of(
                maryam,
                aarav,
                peterPerson,
                ben);

        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
        persons = null;
    }

    @Test
    @DisplayName("all persons get printed")
    void printlnAllPersons() {
        Exercise.printlnAllPersons(persons);
        assertEquals(
                maryam + "\r\n" +
                        aarav + "\r\n" +
                        peter + "\r\n" +
                        ben + "\r\n",
                outContent.toString());
    }

    @Test
    @DisplayName("all persons get printed ordered by their lastname")
    void printlnAllPersonsSortedByLastname() {
        Exercise.printlnAllPersonsSortedByLastname(persons);
        assertEquals(
                maryam + "\r\n" +
                        peter + "\r\n" +
                        ben + "\r\n" +
                        aarav + "\r\n",
                outContent.toString());
    }

    @Test
    @DisplayName("list all lastnames without duplicates")
    void getAllPersonsLastnamesWithoutDuplicates() {
        List<String> lastNames =
                Exercise.getAllPersonsLastnamesSortedByLastnameWithoutDuplicates(persons);
        assertEquals(List.of("Bonddopaddhay", "Müller", "Nehru"), lastNames);
    }

    @Test
    @DisplayName("All peters are from Germany")
    void areAllPetersFromGermany() {
        assertTrue(Exercise.areAllPetersFromGermany(persons));
    }

    @Test
    @DisplayName("all residences in declaration order without berlin twice")
    void getAllPersonsResidencesSortedWithoutDuplicates() {
        List<String> residences =
                Exercise.getAllPersonsResidencesSortedWithoutDuplicates(persons);
        assertEquals(List.of("Berlin", "Mumbai", "Köln"), residences);
    }

    @Test
    @DisplayName("no peter is taller than 190cm")
    void findPeterTallerThan190() {
        Optional<Person> person = Exercise.findPeterTallerThan(persons, 190);
        assertEquals(Optional.empty(), person);
    }

    @Test
    @DisplayName("one peter is taller than 180cm")
    void findPeterTallerThan180() {
        Optional<Person> person = Exercise.findPeterTallerThan(persons, 180);
        assertEquals(Optional.of(peterPerson), person);
    }
}