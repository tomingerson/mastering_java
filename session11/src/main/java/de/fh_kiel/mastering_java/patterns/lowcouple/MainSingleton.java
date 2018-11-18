package de.fh_kiel.mastering_java.patterns.lowcouple;

/**
 * @author Created by tom on 17.11.2018.
 */
public class MainSingleton {
    public static void main(String[] args) {
        var factory = NissanFactorySingleton.getInstance();

        Car gtr_black = factory.buildNissanGTR(GTR_Edition.BLACK);
        Car gtr_nismo = factory.buildNissanGTR(GTR_Edition.NISMO);

        System.out.println("data of a gtr black and a gtr nismo: " + gtr_black + " | " + gtr_nismo);
    }
}
