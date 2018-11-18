package de.fh_kiel.mastering_java.patterns.lab;

/**
 * A lamp.
 */
public class Lamp {

    private LampState state = LampState.OFF;

    public void turnOn() {
        state = LampState.ON;
    }

    public void turnOff() {
        state = LampState.OFF;
    }

    /**
     * @return what state is the lamp currently in?
     */
    public LampState getState() {
        return state;
    }

    /**
     * The state of a lamp can be either turned on or turned off.
     */
    enum LampState {
        ON, OFF
    }
}
