package session8.lab;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Class to search for a certain student's closest neighbor.
 * @author Created by ergouser on 23.10.18.
 */
class CollectionsComparison {

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

    static Person closestStudentList(final String searchName) {

        List<Person> list = new LinkedList<>(students);
        list.sort(Person.PERSON_COMPARATOR);
        Person toSearch = new Person(searchName);
        Person match = null;
        for (Person p : list) {
            if (Person.PERSON_COMPARATOR.compare(p, toSearch) < 0) {
                match = p;
            }
        }

        return match;
    }

    static Person closestStudenQueue(final String searchName) {
        Queue<Person> queue = new PriorityQueue<>(Person.PERSON_COMPARATOR);
        queue.addAll(students);

        Person toSearch = new Person(searchName);
        Person match = null;
        for (int i = 0; i < queue.size(); i++) {
            Person p = queue.poll();
            if (Person.PERSON_COMPARATOR.compare(p, toSearch) < 0) {
                match = p;
            }
        }

        return match;
    }

    static Person closestStudenSet(final String searchName) {
        NavigableSet<Person> set = new TreeSet<>(Person.PERSON_COMPARATOR);
        set.addAll(students);
        return set.floor(new Person(searchName));
    }

    static Person closestStudenMap(final String searchName) {
        NavigableMap<String, Person> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });
        for (Person p : students) {
            map.put(p.getName(), p);
        }
        return map.floorEntry(searchName).getValue();
    }

}
