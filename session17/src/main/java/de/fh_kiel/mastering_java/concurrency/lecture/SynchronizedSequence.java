package de.fh_kiel.mastering_java.concurrency.lecture;

/**
 * Showcase what can go wrong in multithreaded environment.
 * The result is usually different. Sometimes it will be 20000, usually less though.
 *
 * @author Created by tom on 08.12.2018.
 */
public class SynchronizedSequence {
    private int value = 0;

    public static void main(String[] args) throws InterruptedException {
        SynchronizedSequence synchronizedSequence = new SynchronizedSequence();
        Runnable runnable = () -> {
            for (int i = 0; i < 10000; i++) synchronizedSequence.incrementValue();
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(synchronizedSequence.value);
    }

    private synchronized void incrementValue() {
        ++value;
    }
}
