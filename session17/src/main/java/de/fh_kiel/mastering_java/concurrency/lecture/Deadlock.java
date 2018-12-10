package de.fh_kiel.mastering_java.concurrency.lecture;

/**
 * Showcase of 2 threads in a deadlock.
 *
 * @author Created by tom on 09.12.2018.
 */
class Deadlock {
    private static final Object LOCK_1 = new Object();
    private static final Object LOCK_2 = new Object();

    private static Runnable RUNNABLE1 = () -> {
        synchronized (LOCK_1) {
            System.out.println("aquired LOCK_1");
            try {
                Thread.sleep(200L);
            } catch (InterruptedException e) {
                System.err.println("Keep me sleeping!");
            }
            synchronized (LOCK_2) {
                System.out.println("aquired LOCK_2");
            }
            System.out.println("released LOCK_2");
        }
        System.out.println("released LOCK_1");
    };

    private static Runnable RUNNABLE2 = () -> {
        synchronized (LOCK_2) {
            System.out.println("aquired LOCK_2");
            try {
                Thread.sleep(200L);
            } catch (InterruptedException e) {
                System.err.println("Keep me sleeping!");
            }
            synchronized (LOCK_1) {
                System.out.println("aquired LOCK_2");
            }
            System.out.println("released LOCK_2");
        }
        System.out.println("released LOCK_1");
    };

    public static void main(String[] args) {
        Thread t1 = new Thread(RUNNABLE1);
        Thread t2 = new Thread(RUNNABLE2);
        t1.start();
        t2.start();
    }

}
