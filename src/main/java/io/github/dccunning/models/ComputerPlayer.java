package io.github.dccunning.models;

import io.github.dccunning.enums.MoveSymbol;


public class ComputerPlayer implements Player {
    private final String name;
    private final PlayerScores scores = new PlayerScores();

    public ComputerPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public MoveSymbol chooseMove(int gameNumber) {
        return MoveSymbol.randomChoice();
    }

    public PlayerScores getScores() {
        return scores;
    }
}
