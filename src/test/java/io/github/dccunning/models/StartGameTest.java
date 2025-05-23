package io.github.dccunning.models;

import io.github.dccunning.enums.GameResult;
import io.github.dccunning.enums.MoveSymbol;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StartGameTest {

    @Test
    public void playerPaperBeatsRock() {
        StartGame playerGame = new StartGame(MoveSymbol.PAPER);
        assertEquals(GameResult.WIN, playerGame.playerResultAgainst(MoveSymbol.ROCK));
    }

    @Test
    public void playerPaperTiesPaper() {
        StartGame playerGame = new StartGame(MoveSymbol.PAPER);
        assertEquals(GameResult.TIE, playerGame.playerResultAgainst(MoveSymbol.PAPER));
    }

    @Test
    public void playerRockLosesToPaper() {
        StartGame playerGame = new StartGame(MoveSymbol.ROCK);
        assertEquals(GameResult.LOSE, playerGame.playerResultAgainst(MoveSymbol.PAPER));
    }
}
