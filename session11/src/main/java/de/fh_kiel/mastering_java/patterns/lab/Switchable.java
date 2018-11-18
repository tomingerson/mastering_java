package de.fh_kiel.mastering_java.patterns.lab;

public interface Switchable {

    void turnOn();

    void turnOff();

    State getState();

    enum State {
        ON, OFF
    }
}
