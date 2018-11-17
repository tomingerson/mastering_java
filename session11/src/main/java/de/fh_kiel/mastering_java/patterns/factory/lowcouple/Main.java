package de.fh_kiel.mastering_java.patterns.factory.lowcouple;

/**
 * @author Created by tom on 17.11.2018.
 */
public class Main {
    public static void main(String[] args) {
        Car gtr = new NissanFactory().buildNissanGTRBlack();
        Car gtr_nismo = new NissanFactory().buildNissanGTRNismo();

        System.out.println("data of a gtr black and a gtr nismo: " + gtr + " | " + gtr_nismo);
    }
}
