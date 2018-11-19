package de.fh_kiel.mastering_java.patterns.immutable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

/**
 * contract of this class is, that the list is never empty
 */
class Contract {

    private final List<Long> x = new LinkedList<>();

    Contract(Long initialValue) {
        x.add(initialValue);
    }

    boolean removeElement(Long element) {
        if (x.size() > 1) {
            return x.remove(element);
        }
        return false;
    }

    List<Long> getList() {
        return Collections.unmodifiableList(x);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Contract.class.getSimpleName() + "[", "]")
                .add("x=" + x)
                .toString();
    }

    public static void main(String[] args) {
        Contract c = new Contract(12L);
        List<Long> list = c.getList();
        list.clear();

        System.out.println(c);
    }
}
