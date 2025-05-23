package io.github.dccunning.models;

import io.github.dccunning.enums.GameResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerScoresTest {

    @Test
    public void twoWinsPlayerScore() {
        PlayerScores playerScores = new PlayerScores();
        playerScores.addResult(GameResult.WIN);
        playerScores.addResult(GameResult.WIN);
        assertEquals(2, playerScores.getWins());
    }

    @Test
    public void zeroTiesPlayerScore() {
        PlayerScores playerScores = new PlayerScores();
        playerScores.addResult(GameResult.WIN);
        playerScores.addResult(GameResult.LOSE);
        assertEquals(0, playerScores.getTies());
    }

    @Test
    public void oneLossPlayerScore() {
        PlayerScores playerScores = new PlayerScores();
        playerScores.addResult(GameResult.TIE);
        playerScores.addResult(GameResult.LOSE);
        playerScores.addResult(GameResult.TIE);
        assertEquals(1, playerScores.getLoses());
    }
}
