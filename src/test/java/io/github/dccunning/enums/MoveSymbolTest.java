package io.github.dccunning.enums;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class MoveSymbolTest {

    @Test
    public void rockVsPaper() {
        assertTrue(MoveSymbol.PAPER.beats(MoveSymbol.ROCK));
    }

    @Test
    public void rockVsScissors() {
        assertTrue(MoveSymbol.ROCK.beats(MoveSymbol.SCISSORS));
    }

    @Test
    public void paperVsScissors() {
        assertFalse(MoveSymbol.PAPER.beats(MoveSymbol.SCISSORS));
    }

    @Test
    public void randomSymbolChoice() {
        assertTrue(Arrays.asList(MoveSymbol.values()).contains(MoveSymbol.randomChoice()));
    }
}
