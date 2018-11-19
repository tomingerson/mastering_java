package de.fh_kiel.mastering_java.patterns.lab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.internal.util.reflection.FieldSetter;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ButtonTest {

    @InjectMocks
    private Button button;

    @Mock
    private Lamp lamp;

    @BeforeEach
    void setup() throws NoSuchFieldException {
        FieldSetter.setField(button, Button.class.getDeclaredField("lamp"), lamp);
    }

    @Test
    void switchLampOn() {

        Lamp.LampState state = Lamp.LampState.OFF;
        when(lamp.getState()).thenReturn(state);

        button.switchLamp();

        verify(lamp, times(1)).turnOn();
        verify(lamp, times(0)).turnOff();
    }

    @Test
    void switchLampOff() {

        Lamp.LampState state = Lamp.LampState.ON;
        when(lamp.getState()).thenReturn(state);

        button.switchLamp();

        verify(lamp, times(0)).turnOn();
        verify(lamp, times(1)).turnOff();
    }
}