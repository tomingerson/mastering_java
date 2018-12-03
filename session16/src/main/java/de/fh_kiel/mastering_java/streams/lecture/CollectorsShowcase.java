package de.fh_kiel.mastering_java.streams.lecture;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Created by tom on 03.12.2018.
 */
public class CollectorsShowcase {

    private final Address bakerstreet = new Address();
    private final Person sherlock = new Person();
    private final Person watson = new Person();
    private final Person wiggins = new Person();
    private final Collection<Person> detectives = new LinkedList<>();

    {
        bakerstreet.setCity("London");
        bakerstreet.setStreet("Baker Street 221B");
        sherlock.setAddress(bakerstreet);
        sherlock.setLastName("Holmes");
        sherlock.setPersonId(1L);
        sherlock.setAge(60);
        watson.setAddress(bakerstreet);
        watson.setLastName("Watson");
        watson.setPersonId(2L);
        watson.setAge(55);
        wiggins.setPersonId(3L);
        wiggins.setLastName("Wiggins");
        wiggins.setAddress(bakerstreet);
        wiggins.setAge(15);
        detectives.add(sherlock);
        detectives.add(watson);
    }


    Map<Long, String> collectLastnameById() {
        return detectives.parallelStream().collect(Collectors.toMap(Person::getPersonId,
                Person::getLastName));
    }

    Map<Long, Person> collectPersonById() {
        return detectives.parallelStream().collect(Collectors.toMap(Person::getPersonId
                , Function.identity()));
    }

    Map<Address, List<Person>> addrToPerson() {
        return detectives.parallelStream()
                .collect(
                        Collectors.toMap(
                                Person::getAddress,
                                person -> {
                                    List<Person> tmp = new LinkedList<>();
                                    tmp.add(person);
                                    return tmp;
                                },
                                (list1, list2) -> {
                                    list1.addAll(list2);
                                    return list1;
                                }
                        )
                );
    }

    Map<Address, List<Person>> addrToPersonTree() {
        return detectives.parallelStream()
                .collect(
                        Collectors.toMap(
                                Person::getAddress,
                                person -> {
                                    List<Person> tmp = new ArrayList<>();
                                    tmp.add(person);
                                    return tmp;
                                },
                                (list1, list2) -> {
                                    list1.addAll(list2);
                                    return list1;
                                },
                                () -> new TreeMap<>(Comparator.comparing(Address::getStreet))
                        )
                );
    }

    Map<Address, List<Person>> groupedAddrToPerson() {
        return detectives.parallelStream()
                .collect(Collectors.groupingBy(Person::getAddress));
    }

    Map<Boolean, List<Person>> minors() {
        return detectives.stream()
                .collect(Collectors
                        .partitioningBy(person -> person.getAge() < 18));
    }

    Map<Address, Optional<Person>> oldestByAddress() {
        return detectives.stream()
                .collect(
                        Collectors.groupingBy(
                                Person::getAddress,
                                Collectors.maxBy(Comparator.comparingInt(Person::getAge))
                        )
                );
    }

    Collection<Person> getDetectives() {
        return detectives;
    }

    static class Person {
        Long personId;
        String lastName;
        Address address;
        int age;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        String getLastName() {
            return lastName;
        }

        void setLastName(String lastName) {
            this.lastName = lastName;
        }

        Long getPersonId() {
            return personId;
        }

        void setPersonId(Long personId) {
            this.personId = personId;
        }

        Address getAddress() {
            return address;
        }

        void setAddress(Address address) {
            this.address = address;
        }
    }

    static class Address {
        String street;
        String city;

        public String getCity() {
            return city;
        }

        void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        void setStreet(String street) {
            this.street = street;
        }
    }
}
