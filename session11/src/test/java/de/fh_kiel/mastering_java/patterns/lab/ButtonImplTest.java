package de.fh_kiel.mastering_java.patterns.lab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ButtonImplTest {

    private ButtonImplementation<Lamp> buttonImplementation;
    private Lamp lamp;

    @BeforeEach
    void setup() {
        lamp = new Lamp();
        buttonImplementation = new ButtonImplementation<>(lamp);
    }

    @Test
    void switchOn() {
        lamp.turnOff();

        buttonImplementation.action();

        assertEquals(Switchable.State.ON, lamp.getState());
    }

    @Test
    void switchLampOff() {
        lamp.turnOn();

        buttonImplementation.action();

        assertEquals(Switchable.State.OFF, lamp.getState());
    }
}