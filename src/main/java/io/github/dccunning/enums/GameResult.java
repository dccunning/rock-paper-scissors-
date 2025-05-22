package io.github.dccunning.enums;

public enum GameResult {
    WIN("You win!"),
    LOSE("You lose!"),
    TIE("You tie!");

    private final String message;

    GameResult(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
