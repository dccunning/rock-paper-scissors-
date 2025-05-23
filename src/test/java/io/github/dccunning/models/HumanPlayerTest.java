package io.github.dccunning.models;

import io.github.dccunning.enums.MoveSymbol;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HumanPlayerTest {

    @Test
    public void getHumanPlayerName() {
        String move = "rock", name = "Dimitri";
        Scanner fakeInput = new Scanner(move);
        HumanPlayer humanPlayer = new HumanPlayer(name, fakeInput);
        assertEquals(name, humanPlayer.getName());
    }

    @Test
    public void chooseMoveHumanPlayer() {
        String move = "rock", name = "Dimitri";
        Scanner input = new Scanner(move);
        HumanPlayer humanPlayer = new HumanPlayer(name, input);
        assertEquals(MoveSymbol.ROCK, humanPlayer.chooseMove(1));
    }

    @Test
    public void exitGameHumanPlayer() {
        String move = "exit", name = "Dimitri";
        Scanner input = new Scanner(move);
        HumanPlayer humanPlayer = new HumanPlayer(name, input);
        assertNull(humanPlayer.chooseMove(1));
    }
}
