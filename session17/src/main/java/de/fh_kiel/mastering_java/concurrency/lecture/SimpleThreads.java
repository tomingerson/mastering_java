package de.fh_kiel.mastering_java.concurrency.lecture;


import java.util.Optional;

/**
 * @author Created by tom on 08.12.2018.
 * @see <a href="https://docs.oracle.com/javase/tutorial/essential/concurrency/simple.html">Oracle Tutorial</a>
 */
public class SimpleThreads {

    private static final Runnable messageLoop = () -> {
        final String[] importantInfo = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        try {
            for (String s : importantInfo) {
                // Pause for 4 seconds
                Thread.sleep(4000L);
                // Print a message
                threadMessage(s);
            }
        } catch (InterruptedException e) {
            threadMessage("I wasn't done yet!");
        }
    };

    /**
     * Display a message, preceded by the name of the current thread
     *
     * @param message the text to display
     */
    private static void threadMessage(String message) {
        //String threadName = Thread.currentThread().getName();
        String threadName = Thread.currentThread().toString();
        System.out.format("%s: %s%n", threadName, message);
    }

    public static void main(String... args) throws InterruptedException {
        long patience = calculatePatience(args);

        threadMessage("Starting MessageLoop thread");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(messageLoop);
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();

        threadMessage("Waiting for MessageLoop thread to finish");
        // loop until MessageLoop thread exits
        while (t.isAlive()) {
            threadMessage("Still waiting...");
            // Wait maximum of 1 second for MessageLoop thread to finish.
            t.join(1000L);
            if (((System.currentTimeMillis() - startTime) > patience) && t.isAlive()) {
                threadMessage("Tired of waiting!");
                t.interrupt();
                // Shouldn't be long now -- wait indefinitely
                t.join();
            }
        }
        threadMessage("Finally!");
    }

    /**
     * Delay, in milliseconds before we interrupt MessageLoop thread (default one hour).
     *
     * @param args patience in seconds; does not need to be present
     * @return delay before interrupting MessageLoop
     */
    private static long calculatePatience(String[] args) {
        long patience = 0L;
        try {
            patience = Optional.of(args)
                    .filter(arg -> arg.length > 0)
                    .map(arg -> Long.parseLong(arg[0]) * 1000L)
                    .orElse(1000L * 60L * 60L);
        } catch (NumberFormatException e) {
            System.err.println("Argument must be an integer.\r\nNumberFormatException " + e.getLocalizedMessage());
            System.exit(1);
        }
        return patience;
    }

}
