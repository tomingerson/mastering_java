package session8.lab;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Created by ergouser on 23.10.18.
 */
public class CollectionsComparison {

    private static Collection<Person> students = List.of(
            new Person("Kristof"),
            new Person("Jannik"),
            new Person("Jorge"),
            new Person("Joshua"),
            new Person("Shriam"),
            new Person("Araz"),
            new Person("Uche"),
            new Person("Anna"),
            new Person("Sylvia"),
            new Person("Tim"),
            new Person("Simon"),
            new Person("Henning"),
            new Person("Lasse"),
            new Person("Emmy"),
            new Person("Rajisha"),
            new Person("Sudesh"),
            new Person("Kiran"),
            new Person("Indra"),
            new Person("Ali")
    );

    static Person closestStudentList(String searchName) {
        List<Person> list = new LinkedList<>(students);
        Collections.sort(list);
        Person match = null;
        for (Person p : list) {
            if (p.compareTo(match) < 0) {
                match = p;
            }
        }

        return match;
    }
}
