package de.fh_kiel.mastering_java.concurrency.lecture;

import java.io.IOException;

/**
 * Showcase for processes; creation, start, waitFor.
 * @author Created by tom on 08.12.2018.
 */
public class ExampleProcess {

    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder pwd = new ProcessBuilder("pwd").inheritIO();
        ProcessBuilder ls = new ProcessBuilder("ls", "-rtl").inheritIO();

        pwd.start().waitFor();
        ls.start();
    }
}
