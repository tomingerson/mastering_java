package de.fh_kiel.mastering_java.session10.producer;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Showcase of a Producer used by the consumer of the module2.
 *
 * @author Created by tom on 28.10.2018.
 */
public class Producer {

    /**
     * @return generates a random String
     */
    public static String produce() {
        return RandomStringUtils.random(20, true, false);
    }
}
