package io.github.dccunning.enums;

import java.util.Arrays;

public class MoveSymbolTest {
    public MoveSymbolTest() {
        rockVsPaper();
        rockVsScissors();
        paperVsScissors();
        randomSymbolChoice();
    }

    private void rockVsPaper() {
        assert MoveSymbol.PAPER.beats(MoveSymbol.ROCK);
        System.out.println("rockVsPaper passed");
    }

    private void rockVsScissors() {
        assert MoveSymbol.ROCK.beats(MoveSymbol.SCISSORS);
        System.out.println("rockVsScissors passed");
    }

    private void paperVsScissors() {
        assert !MoveSymbol.PAPER.beats(MoveSymbol.SCISSORS);
        System.out.println("paperVsScissors passed");
    }

    private void randomSymbolChoice() {
        assert Arrays.asList(MoveSymbol.values()).contains(MoveSymbol.randomChoice());
        System.out.println("randomSymbolChoice passed");
    }
}
