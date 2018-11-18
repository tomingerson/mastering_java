package de.fh_kiel.mastering_java.patterns.lab;

public interface Button<T extends Switchable> {

    /**
     * @return the device to switch
     */
    T getSwitchable();

    /**
     * Executes the buttons action (switching the switchable)
     */
    default void action() {
        if (getSwitchable().getState() == Switchable.State.ON) {
            getSwitchable().turnOff();
        } else {
            getSwitchable().turnOn();
        }
    }
}
