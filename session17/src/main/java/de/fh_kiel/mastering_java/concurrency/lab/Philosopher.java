package de.fh_kiel.mastering_java.concurrency.lab;

/**
 * The Philosopher, who can think or eat having two forks.
 */
class Philosopher implements Runnable {

    private final Fork leftFork, rightFork;

    /**
     * Creates a new Philosopher.
     *
     * @param leftFork  his left Fork - is shared with his left neighbor
     * @param rightFork his right Fork - is shared with his right neighbor
     */
    Philosopher(final Fork leftFork, final Fork rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    /**
     * Think about something for a while.
     */
    void think() {

    }

    /**
     * Aquire both forks and start eating. When finished, put the forks back on the table.
     */
    void eat() {

    }

    @Override
    public void run() {
        while (true) {
            think();
            eat();
        }
    }
}
