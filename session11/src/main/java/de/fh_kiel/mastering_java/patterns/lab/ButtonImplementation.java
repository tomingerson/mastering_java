package de.fh_kiel.mastering_java.patterns.lab;

public class ButtonImplementation<T extends Switchable> implements Button<T> {
    private final T switchable;

    public ButtonImplementation(T switchable) {
        this.switchable = switchable;
    }

    @Override
    public T getSwitchable() {
        return switchable;
    }
}
