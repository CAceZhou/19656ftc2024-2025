package org.firstinspires.ftc.teamcode.common.hardware.Gamepad;

import com.qualcomm.robotcore.hardware.Gamepad;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Consumer;

public class ListEventGamepad extends Gamepad {
    private final ScheduledExecutorService pollingExecutor =
            Executors.newSingleThreadScheduledExecutor();
    private final Map<Buttons, CopyOnWriteArrayList<Runnable>>
            registeredButtonPress = initEventMap(new HashMap<>());

    private final Map<Buttons, CopyOnWriteArrayList<Runnable>>
            registeredButtonRelease = initEventMap(new HashMap<>());

    private final Map<Buttons, CopyOnWriteArrayList<Consumer<Boolean>>>
            registeredButtonChange = initEventMap(new HashMap<>());

    private static <T> Map<Buttons, CopyOnWriteArrayList<T>>
    initEventMap(Map<Buttons, CopyOnWriteArrayList<T>> mapToInit) {
        for (Buttons button : Buttons.values()) {
            mapToInit.put(button, new CopyOnWriteArrayList<>());
        }
        return Collections.unmodifiableMap(mapToInit);
    }

    public ListEventGamepad() {
        pollingExecutor.schedule()
    }

    private void pollGamepadState() {

    }

    public void onButtonPress(Buttons button, Runnable action) {
        Objects.requireNonNull(registeredButtonPress.get(button)).add(action);
    }

    public void onButtonRelease(Buttons button, Runnable action) {
        Objects.requireNonNull(registeredButtonRelease.get(button)).add(action);
    }

    public void onButtonChange(Buttons button, Consumer<Boolean> action) {
        Objects.requireNonNull(registeredButtonChange.get(button)).add(action);
    }


}
