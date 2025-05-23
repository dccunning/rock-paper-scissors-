package io.github.dccunning.models;

import io.github.dccunning.enums.GameResult;
import io.github.dccunning.enums.MoveSymbol;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class ComputerPlayerTest {

    @Test
    public void validateComputerPlayerMove() {
        String name = "Computer";
        Player computerPlayer = new ComputerPlayer(name);
        assertInstanceOf(MoveSymbol.class, computerPlayer.chooseMove(1));
    }

    @Test
    public void getPlayerScores() {
        String name = "Computer";
        Player computerPlayer = new ComputerPlayer(name);
        computerPlayer.getScores().addResult(GameResult.LOSE);
        computerPlayer.getScores().addResult(GameResult.LOSE);
        assertEquals(2, computerPlayer.getScores().getLoses());
    }
}
