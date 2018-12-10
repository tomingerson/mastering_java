package de.fh_kiel.mastering_java.concurrency.lecture;

import java.util.stream.IntStream;

/**
 * Showcase for creating threads
 * @author Created by tom on 08.12.2018.
 */
public class ExampleThread {

    public static void main(String[] args) {
        Thread noopThread = new Thread();
        Thread otherNoopThread = new Thread(() -> {});
        Thread sumUpThread = new Thread(
                () -> System.out.println(IntStream.range(0, 100000).sum())
        );
        Thread sleepingThread = new Thread(() -> {
            try {
                Thread.sleep(5000L);
                System.out.println("wake up");
            } catch (InterruptedException e) {
                System.err.println("I was not done sleeping.");
            }
        });

        noopThread.start();
        otherNoopThread.start();
        sumUpThread.start();
        sleepingThread.start();

        sleepingThread.interrupt();

        try {
            sumUpThread.join();
        } catch (InterruptedException e) {
            System.err.println("sumUp got interrupted, while we were waiting");
        }
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(IntStream.range(0, 100000).sum());
        }

        public static void main(String[] args) {
            Thread t = new MyThread();
            t.start();
        }
    }
}
