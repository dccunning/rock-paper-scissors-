package io.github.dccunning.models;

import io.github.dccunning.enums.GameResult;
import io.github.dccunning.enums.MoveSymbol;

public class StartGame {
    private final MoveSymbol move;

    public StartGame(MoveSymbol move) {
        this.move = move;
    }

    /**
     * Play paper, rock, scissors from this player against an input player move
     * @param responseMove move symbol of the input player
     * @return the result of the game
     */
    public GameResult playerResultAgainst(MoveSymbol responseMove) {
        if (move.beats(responseMove)) {
            return GameResult.WIN;
        } else if (responseMove.beats(move)) {
            return GameResult.LOSE;
        } else {
            return GameResult.TIE;
        }
    }
}
