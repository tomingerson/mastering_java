package de.fh_kiel.mastering_java.concurrency.lecture;

/**
 * Showcase what can go wrong in multithreaded environment.
 * The result is usually different. Sometimes it will be 20000, usually less though.
 *
 * @author Created by tom on 08.12.2018.
 */
public class UnsafeSequence {
    private int value = 0;

    public static void main(String[] args) throws InterruptedException {
        UnsafeSequence unsafeSequence = new UnsafeSequence();
        Runnable runnable = () -> {
            for (int i = 0; i < 10000; i++) unsafeSequence.incrementValue();
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(unsafeSequence.value);
    }

    private void incrementValue() {
        ++value;
    }
}
