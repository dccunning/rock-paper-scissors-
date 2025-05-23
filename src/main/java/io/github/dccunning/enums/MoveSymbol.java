package io.github.dccunning.enums;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public enum MoveSymbol {
    PAPER("paper"),
    ROCK("rock"),
    SCISSORS("scissors");

    private final String name;

    MoveSymbol(String name) {
        this.name = name;
    }

    public String getName() {return name;}

    /**
     * Check if an instance of move beats another instance, false includes ties
     * @param responseMove the input move to play against
     * @return true if this move beats the input move, false otherwise
     */
    public boolean beats(MoveSymbol responseMove) {
        return (
                this == ROCK && responseMove == SCISSORS
                || this == PAPER && responseMove == ROCK
                || this == SCISSORS && responseMove == PAPER
        );
    }

    /**
     * Randomly select one of the possible moves
     * @return a move symbol object
     */
    public static MoveSymbol randomChoice() {
        int numberOfEnums = MoveSymbol.values().length;
        int n = ThreadLocalRandom.current().nextInt(0, numberOfEnums);
        List<MoveSymbol> moves = Arrays.asList(MoveSymbol.values());
        return moves.get(n);
    }
}
