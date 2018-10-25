package session8.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Created by ergouser on 23.10.18.
 */
class CollectionsComparisonTest {

    @Test
    void closestStudentList() {
        Person match = CollectionsComparison.closestStudentList("Tom");
        assertEquals(new Person("Tim"), match);
    }

    @Test
    void closestStudentQueue() {
        Person match = CollectionsComparison.closestStudenQueue("Tom");
        assertEquals(new Person("Tim"), match);
    }

    @Test
    void closestStudentSet() {
        Person match = CollectionsComparison.closestStudenSet("Tom");
        assertEquals(new Person("Tim"), match);
    }

    @Test
    void closestStudentMap() {
        Person match = CollectionsComparison.closestStudenMap("Tom");
        assertEquals(new Person("Tim"), match);
    }
}