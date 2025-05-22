package io.github.dccunning.enums;

public class GameResultTest {
    public GameResultTest() {
        gameResultWin();
        gameResultLose();
        gameResultTie();
    }

    private void gameResultWin() {
        GameResult gameResult = GameResult.WIN;
        assert gameResult.getMessage().equals("You win!");
        System.out.println("gameResultWin passed");
    }

    private void gameResultLose() {
        GameResult gameResult = GameResult.LOSE;
        assert gameResult.getMessage().equals("You lose!");
        System.out.println("gameResultLose passed");
    }

    private void gameResultTie() {
        GameResult gameResult = GameResult.TIE;
        assert !gameResult.getMessage().equals("You tied!");
        System.out.println("gameResultTie passed");
    }
}
