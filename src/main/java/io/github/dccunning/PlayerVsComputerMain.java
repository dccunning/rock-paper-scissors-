package io.github.dccunning;

import io.github.dccunning.enums.GameResult;
import io.github.dccunning.enums.MoveSymbol;
import io.github.dccunning.models.StartGame;
import io.github.dccunning.models.PlayerScores;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PlayerVsComputerMain {
    public static void main(String[] args) {
        System.out.println("Paper Rock Scissors");
        PlayerScores personScores = new PlayerScores();

        // Ask the player for an integer number of games to play until they give one. They can also enter 'exit' to end game.
        while (true) {
            System.out.println("Enter the number of games to play (n=): ");
            Scanner input = new Scanner(System.in);

            String numberOfGamesResponse = input.nextLine().trim();
            if (numberOfGamesResponse.equalsIgnoreCase("exit")) {return;}

            try {
                int numberOfGames = Integer.parseInt(numberOfGamesResponse);
                for (int gameNumber = 1; gameNumber <= numberOfGames; gameNumber++) {
                    // Computer selects their move at random
                    MoveSymbol computerMove = MoveSymbol.randomChoice();

                    // Ask the player for a move until they give one. They can also enter 'exit' to end game.
                    MoveSymbol playerMove = requestPlayersMove(input, gameNumber);
                    if (playerMove == null) {return;}

                    // Play the game for the player and update their scores
                    GameResult playerResult = displayPlayerGameResult(playerMove, computerMove);
                    personScores.updateResult(playerResult);

                }
                displayFinalPlayerScores(personScores);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input must be an integer.");
            }
        }

    }

    /**
     * Determine the result of the rock, paper, scissors game for the player, and display the response message.
     * @param playerMove Move taken by player (ROCK, PAPER or SCISSORS)
     * @param computerMove Move taken by computer (ROCK, PAPER or SCISSORS)
     * @return The result of the game for the player
     */
    private static GameResult displayPlayerGameResult(MoveSymbol playerMove, MoveSymbol computerMove) {
        StartGame playerStartsGame = new StartGame(playerMove);
        GameResult playerResult = playerStartsGame.playerResultAgainst(computerMove);
        System.out.println(
                "Computer plays " + computerMove.getName() + ", " + playerResult.getMessage()
        );
        System.out.println("--------------------");
        return playerResult;
    }

    /**
     * Request the input for the player's move in the game, require only accepted move symbols.
     * @param input The scanner input to gather the text response
     * @param gameNumber the nth game iteration to be displayed
     * @return The selected game move symbol, null if user exits the game
     */
    private static MoveSymbol requestPlayersMove(Scanner input, int gameNumber) {
        while (true) {
            System.out.println("Game #" + gameNumber + ": Paper, rock or scissors?");
            String playerMoveResponse = input.next().trim();
            if (playerMoveResponse.equalsIgnoreCase("exit")) {return null;}
            try {
                return MoveSymbol.valueOf(playerMoveResponse.toUpperCase());
            } catch (IllegalArgumentException e) {
                List<String> moveOptions = Arrays.stream(MoveSymbol.values()).map(MoveSymbol::getName).toList();
                String moveOptionsString = String.join(", ", moveOptions);
                System.out.println("Enter only " + moveOptionsString + " are valid choices.");
            }
        }
    }

    /**
     * Display the players final wins, loses and ties at the end of the game, or on exit.
     * @param scores The players' scores
     */
    private static void displayFinalPlayerScores(PlayerScores scores) {
        System.out.println("Game over");
        System.out.println();
        System.out.println("Player results:");
        System.out.println("Wins: " + scores.getWins());
        System.out.println("Losses: " + scores.getLoses());
        System.out.println("Ties: " + scores.getTies());
    }
}