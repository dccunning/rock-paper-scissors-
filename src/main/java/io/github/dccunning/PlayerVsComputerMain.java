package io.github.dccunning;

import io.github.dccunning.enums.GameResult;
import io.github.dccunning.enums.MoveSymbol;
import io.github.dccunning.models.*;

import java.util.Scanner;

import static io.github.dccunning.utils.MoveUtils.moveOptionsString;

public class PlayerVsComputerMain {
    public static void main(String[] args) {
        String displayGameTitle = moveOptionsString(true, " ");
        System.out.println(displayGameTitle);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter players name: ");
        String humanName = input.nextLine().trim();

        HumanPlayer humanPlayer = new HumanPlayer(humanName, input);
        ComputerPlayer computerPlayer = new ComputerPlayer("Computer");

        // Ask the human for an integer number of games to play until they give one. They can also enter 'exit' to end game.
        while (true) {
            System.out.print("Enter the number of games to play: ");
            String numberOfGamesResponse = input.nextLine().trim();

            if (numberOfGamesResponse.equalsIgnoreCase("exit")) {return;}

            try {
                for (int gameNumber = 1; gameNumber <= Integer.parseInt(numberOfGamesResponse); gameNumber++) {
                    // Computer selects their move at random
                    MoveSymbol computerMove = computerPlayer.chooseMove(gameNumber);

                    // Ask the player for a move until they give one. They can also enter 'exit' to end game.
                    MoveSymbol playerMove = humanPlayer.chooseMove(gameNumber);
                    if (playerMove == null) {return;}

                    // Play the game for the player and update their scores
                    GameResult playerResult = displayPlayerGameResult(playerMove, computerMove);
                    humanPlayer.getScores().addResult(playerResult);

                }
                displayFinalScores(humanPlayer);
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
     * Display the players final wins, loses and ties at the end of the game, or on exit.
     * @param humanPlayer The player to display scores for
     */
    private static void displayFinalScores(Player humanPlayer) {
        System.out.println("Game over");
        System.out.println();
        PlayerScores scores = humanPlayer.getScores();
        System.out.println(humanPlayer.getName() + "'s results:");
        System.out.println("Wins: " + scores.getWins());
        System.out.println("Losses: " + scores.getLoses());
        System.out.println("Ties: " + scores.getTies());
    }
}