package de.fh_kiel.mastering_java.concurrency.lecture;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Showcase of synchronized statement and reentrant lock.
 * @author Created by tom on 09.12.2018.
 */
class NameCounter {

    private long nameCounter;
    private String lastName;
    private final List<String> nameList = new LinkedList<>();

    public void addName(final String name) {
        synchronized (this) {
            lastName=name;
            nameCounter++;
        }
        nameList.add(name);
    }

    public List<String> addNameAndGetList(String name) {
        synchronized (this) {
            addName(name);
            return Collections.unmodifiableList(nameList);
        }
    }

    public synchronized String getLastEnteredName() {
        return this.lastName;
    }
}
