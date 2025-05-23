package io.github.dccunning.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveUtilsTest {

    @Test
    public void moveOptionsStringCapitalised() {
        String moveOptionsString = MoveUtils.moveOptionsString(true, " ");
        assertEquals("Paper rock scissors", moveOptionsString);
    }

    @Test
    public void moveOptionsStringDashDelimiter() {
        String moveOptionsString = MoveUtils.moveOptionsString(false, "-");
        assertEquals("paper-rock-scissors", moveOptionsString);
    }
}
