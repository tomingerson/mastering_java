package de.fh_kiel.mastering_java.patterns.immutable;

import java.util.LinkedList;
import java.util.List;

/**
 * @param <T> the type of elements in this collection
 * @author Created by tom on 19.11.2018.
 */
class ImmutableList<T> {
    private final List<T> elements = new LinkedList<>();

    ImmutableList(List<T> elements) {
        this.elements.addAll(elements);
    }

    ImmutableList<T> addElement(T element) {
        List<T> newElements = new LinkedList<>(elements);
        newElements.add(element);
        return new ImmutableList<>(newElements);
    }

}
