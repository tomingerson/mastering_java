package de.fh_kiel.mastering_java.patterns.lab;


/**
 * A button to switch a lamp on and off.
 */
public class Button {
    private final Lamp lamp = new Lamp();

    /**
     * switches the lamp either on or off, depending on its current state.
     */
    public void switchLamp() {
        Lamp.LampState state = lamp.getState();
        if (state == Lamp.LampState.ON) {
            lamp.turnOff();
        } else {
            lamp.turnOn();
        }
    }
}
