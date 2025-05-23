package io.github.dccunning.models;

import io.github.dccunning.enums.GameResult;
import io.github.dccunning.enums.MoveSymbol;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class PlayerTest {

    @Test
    public void getPlayerName() {
        String name = "Dimitri bot";
        Player computerPlayer = new ComputerPlayer(name);
        assertEquals(name, computerPlayer.getName());
    }

    @Test
    public void choosePlayerMove() {
        String name = "Computer 1";
        Player computerPlayer = new ComputerPlayer(name);
        assertInstanceOf(MoveSymbol.class, computerPlayer.chooseMove(1));
    }

    @Test
    public void getPlayerScores() {
        String name = "Computer 1";
        Player computerPlayer = new ComputerPlayer(name);
        computerPlayer.getScores().addResult(GameResult.WIN);
        assertEquals(1, computerPlayer.getScores().getWins());
    }
}
