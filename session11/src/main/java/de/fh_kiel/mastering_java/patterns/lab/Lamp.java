package de.fh_kiel.mastering_java.patterns.lab;

/**
 * A lamp.
 */
public class Lamp implements Switchable {

    private State state = State.OFF;

    public void turnOn() {
        state = State.ON;
    }

    public void turnOff() {
        state = State.OFF;
    }

    /**
     * @return what state is the lamp currently in?
     */
    public State getState() {
        return state;
    }
}
