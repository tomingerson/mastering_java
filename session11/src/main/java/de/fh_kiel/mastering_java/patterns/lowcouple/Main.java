package de.fh_kiel.mastering_java.patterns.lowcouple;

/**
 * @author Created by tom on 17.11.2018.
 */
public class Main {
    public static void main(String[] args) {
        Car gtr_black = new NissanFactory().buildNissanGTR(GTR_Edition.BLACK);
        Car gtr_nismo = new NissanFactory().buildNissanGTR(GTR_Edition.NISMO);

        System.out.println("data of a gtr black and a gtr nismo: " + gtr_black + " | " + gtr_nismo);
    }
}
