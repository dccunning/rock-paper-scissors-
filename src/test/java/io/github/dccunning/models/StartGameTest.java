package io.github.dccunning.models;

import io.github.dccunning.enums.GameResult;
import io.github.dccunning.enums.MoveSymbol;

public class StartGameTest {
    public StartGameTest() {
        playerPaperBeatsRock();
        playerPaperTiesPaper();
        playerRockLosesToPaper();
    }

    private void playerPaperBeatsRock() {
        StartGame playerGame = new StartGame(MoveSymbol.PAPER);
        assert playerGame.playerResultAgainst(MoveSymbol.ROCK) == GameResult.WIN;
        System.out.println("playerPaperBeatsRock passed");
    }

    private void playerPaperTiesPaper() {
        StartGame playerGame = new StartGame(MoveSymbol.PAPER);
        assert playerGame.playerResultAgainst(MoveSymbol.PAPER) == GameResult.TIE;
        System.out.println("playerPaperTiesPaper passed");
    }

    private void playerRockLosesToPaper() {
        StartGame playerGame = new StartGame(MoveSymbol.ROCK);
        assert playerGame.playerResultAgainst(MoveSymbol.PAPER) == GameResult.LOSE;
        System.out.println("playerRockLosesToPaper passed");
    }
}
