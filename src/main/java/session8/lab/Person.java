package session8.lab;

import java.util.Comparator;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * @author Created by ergouser on 23.10.18.
 */
class Person {

    public Person(final String name) {
        if (null == name) throw new IllegalArgumentException("name must not be null");
        this.name = name;
    }

    private final String name;

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }

    public String getName() {
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

    static class PersonComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            if (o1 == null && o2 == null) return 0;
            if (o1 == null) return -1;
            if (o2 == null) return 1;
            return o1.getName().compareTo(o2.getName());
        }
    }
}