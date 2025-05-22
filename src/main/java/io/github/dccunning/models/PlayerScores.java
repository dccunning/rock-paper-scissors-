package io.github.dccunning.models;

import io.github.dccunning.enums.GameResult;

public class PlayerScores {
    private int wins = 0;
    private int loses = 0;
    private int ties = 0;

    public int getWins() {return wins;}
    public int getLoses() {return loses;}
    public int getTies() {return ties;}

    /**
     * Increment one of wins, loses or ties by 1 with the input result
     * @param result game result to update the score with
     */
    public void updateResult(GameResult result) {
        if (result == GameResult.WIN) {
            wins++;
        } else if (result == GameResult.LOSE) {
            loses++;
        } else if (result == GameResult.TIE) {
            ties++;
        }
    }
}
