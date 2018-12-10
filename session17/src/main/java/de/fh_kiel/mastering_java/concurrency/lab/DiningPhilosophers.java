package de.fh_kiel.mastering_java.concurrency.lab;

/**
 * @author Created by tom on 09.12.2018.
 */
public class DiningPhilosophers {
    public static void main(String[] args) {

        Philosopher[] philosophers = new Philosopher[5];

        Fork[] forks = new Fork[philosophers.length];
        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Fork();
        }

        for (int i = 0; i < philosophers.length; i++) {
            Fork leftFork = forks[i];
            Fork rightFork = forks[(i + 1) % forks.length];

            philosophers[i] = new Philosopher(leftFork, rightFork);

            Thread t = new Thread(philosophers[i], "Philosopher " + (i + 1));
            t.start();
        }
    }
}
