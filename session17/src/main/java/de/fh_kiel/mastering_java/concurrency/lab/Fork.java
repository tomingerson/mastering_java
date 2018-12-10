package de.fh_kiel.mastering_java.concurrency.lab;

import java.util.concurrent.Semaphore;

/**
 * A simple class without any methods or members representing a fork for a philosopher
 * to take.
 * @author Created by tom on 09.12.2018.
 */
class Fork extends Semaphore {

    public Fork() {
        super(1, true);
    }
}
