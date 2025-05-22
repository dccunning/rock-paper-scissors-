package io.github.dccunning.models;

import io.github.dccunning.enums.GameResult;

public class PlayerScoresTest {
    public PlayerScoresTest() {
        twoWinsPlayerScore();
        zeroTiesPlayerScore();
        oneLossPlayerScore();
    }

    private void twoWinsPlayerScore() {
        PlayerScores playerScores = new PlayerScores();
        playerScores.updateResult(GameResult.WIN);
        playerScores.updateResult(GameResult.WIN);
        assert playerScores.getWins() == 2;
        System.out.println("twoWinsPlayerScore passed");
    }

    private void zeroTiesPlayerScore() {
        PlayerScores playerScores = new PlayerScores();
        playerScores.updateResult(GameResult.WIN);
        playerScores.updateResult(GameResult.LOSE);
        assert playerScores.getTies() == 0;
        System.out.println("zeroTiesPlayerScore passed");
    }

    private void oneLossPlayerScore() {
        PlayerScores playerScores = new PlayerScores();
        playerScores.updateResult(GameResult.TIE);
        playerScores.updateResult(GameResult.LOSE);
        playerScores.updateResult(GameResult.TIE);
        assert playerScores.getLoses() == 1;
        System.out.println("oneLossPlayerScore passed");
    }
}
