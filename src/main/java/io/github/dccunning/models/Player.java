package io.github.dccunning.models;

import io.github.dccunning.enums.MoveSymbol;

public interface Player {
    String getName();
    MoveSymbol chooseMove(int gameNumber);
    PlayerScores getScores();
}
