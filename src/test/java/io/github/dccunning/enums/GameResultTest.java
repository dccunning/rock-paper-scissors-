package io.github.dccunning.enums;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameResultTest {

    @Test
    public void gameResultWin() {
        GameResult gameResult = GameResult.WIN;
        assertEquals("You win!", gameResult.getMessage());
    }

    @Test
    public void gameResultLose() {
        GameResult gameResult = GameResult.LOSE;
        assertEquals("You lose!", gameResult.getMessage());
    }

    @Test
    public void gameResultTie() {
        GameResult gameResult = GameResult.TIE;
        assertNotEquals("You tied!", gameResult.getMessage());
    }
}
