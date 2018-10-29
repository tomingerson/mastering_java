package de.fh_kiel.mastering_java.session10.consumer;

import de.fh_kiel.mastering_java.session10.producer.Producer;

/**
 * @author Created by tom on 28.10.2018.
 */
public class Consumer {

    public static void main(String[] args) {
        System.out.println(Producer.produce());
    }
}
