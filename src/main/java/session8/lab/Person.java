package session8.lab;

/**
 * @author Created by ergouser on 23.10.18.
 */
public class Person implements Comparable {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        return this.name.compareTo(((Person) o).getName());
    }
}