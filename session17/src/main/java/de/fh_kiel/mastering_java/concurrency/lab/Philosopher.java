package de.fh_kiel.mastering_java.concurrency.lab;

import org.apache.commons.math3.random.RandomDataGenerator;

import java.util.concurrent.TimeUnit;

/**
 * The Philosopher, who can think or eat having two forks.
 */
class Philosopher implements Runnable {

    private final Fork leftFork, rightFork;
    private final String name;
    private final RandomDataGenerator rand = new RandomDataGenerator();

    /**
     * Creates a new Philosopher.
     *
     * @param name      of this philosopher
     * @param leftFork  his left Fork - is shared with his left neighbor
     * @param rightFork his right Fork - is shared with his right neighbor
     */
    Philosopher(final String name, final Fork leftFork, final Fork rightFork) {
        this.name = name;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    /**
     * Think about something for a while.
     */
    private void think() {
        long thinkingTime = rand.nextLong(1000L, 5000L);
        System.out.println(this + " is going to think about something for " + thinkingTime + "ms");
        try {
            Thread.sleep(thinkingTime);
        } catch (InterruptedException e) {
            // ignore this exception
        }
    }

    /**
     * Aquire both forks and start eating. When finished, put the forks back on the table.
     */
    private void eat() throws InterruptedException {
        long eatingTime = rand.nextLong(5000L, 10000L);
        System.out.println(this + " starts to eat");
        if (leftFork.tryAcquire(5, TimeUnit.SECONDS)) {
            System.out.println(this + " got left fork");
            if (rightFork.tryAcquire(5, TimeUnit.SECONDS)) {
                System.out.println(this + " got right fork");
                Thread.sleep(eatingTime);
                System.out.println(this + " is finished eating");
                rightFork.release();
                System.out.println(this + " put right fork down");
            } else {
                System.out.println(this + " gave up waiting for right fork");
            }
            leftFork.release();
            System.out.println(this + " put left fork down");
        } else {
            System.out.println(this + " gave up waiting for right fork");
        }
    }

    @Override
    public void run() {
        while (true) {
            think();
            try {
                eat();
            } catch (InterruptedException e) {
                // ignore interrupt while eating
            }
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
