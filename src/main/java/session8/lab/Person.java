package session8.lab;

import java.util.Comparator;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Person having a name;
 * @author Created by ergouser on 23.10.18.
 */
class Person {

    static final PersonComparator PERSON_COMPARATOR = new PersonComparator();
    private final String name;

    Person(final String name) {
        if (null == name) throw new IllegalArgumentException("name must not be null");
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }

    String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    /**
     * Null-safe comparator for Person.
     */
    static class PersonComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            if (o1 == null && o2 == null) return 0;
            if (o1 == null) return -1;
            if (o2 == null) return 1;
            // natural order of String
            //return o1.getName().compareTo(o2.getName());

            // comparison by length (then lexicographically)
            if (o1.getName().length() == o2.getName().length()) {
                return o1.getName().compareTo(o2.getName());
            }
            return o1.getName().length() - o2.getName().length();
        }
    }
}