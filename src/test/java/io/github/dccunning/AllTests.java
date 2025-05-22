package io.github.dccunning;

import io.github.dccunning.enums.GameResultTest;
import io.github.dccunning.enums.MoveSymbolTest;
import io.github.dccunning.models.PlayerScoresTest;
import io.github.dccunning.models.StartGameTest;

public class AllTests {
    public static void main(String[] args) {
        new GameResultTest();
        new MoveSymbolTest();
        new PlayerScoresTest();
        new StartGameTest();
        System.out.println();
        System.out.println("All tests passed");
    }
}
