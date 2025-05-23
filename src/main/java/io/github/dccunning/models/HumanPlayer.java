package io.github.dccunning.models;

import io.github.dccunning.enums.MoveSymbol;

import java.util.Scanner;

import static io.github.dccunning.utils.MoveUtils.moveOptionsString;


public class HumanPlayer implements Player {
    private final String name;
    private final Scanner input;
    private final PlayerScores scores = new PlayerScores();

    public HumanPlayer(String name, Scanner input) {
        this.name = name;
        this.input = input;
    }

    public String getName() {
        return name;
    }

    public MoveSymbol chooseMove(int gameNumber) {
        return requestPlayersMove(gameNumber);
    }

    public PlayerScores getScores() {
        return scores;
    }

    /**
     * Request the input for the player's move in the game, require only accepted move symbols.
     * @param gameNumber the nth game iteration to be displayed
     * @return The selected game move symbol, null if user exits the game
     */
    private MoveSymbol requestPlayersMove(int gameNumber) {
        while (true) {
            String moveOptionsString = moveOptionsString(true, ", ");
            System.out.print("Game #" + gameNumber + ": " + moveOptionsString + "? ");
            String playerMoveResponse = input.next().trim();
            if (playerMoveResponse.equalsIgnoreCase("exit")) {return null;}
            try {
                return MoveSymbol.valueOf(playerMoveResponse.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Only " + moveOptionsString(false, ", ") + " are valid choices.");
            }
        }
    }
}
