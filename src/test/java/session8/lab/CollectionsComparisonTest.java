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
}