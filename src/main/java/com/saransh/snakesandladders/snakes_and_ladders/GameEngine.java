package com.saransh.snakesandladders.snakes_and_ladders;

import com.saransh.snakesandladders.snakes_and_ladders.model.Board;
import java.util.Optional;

public class GameEngine {

    private final Board board;

    public GameEngine() {
        this.board = Board.defaultBoard();
    }

    public GameEngine(Board board) {
        this.board = board;
    }

    public int move(int currentPosition, int diceOutcome) {

        if (diceOutcome < 1 || diceOutcome > 6) {
            throw new IllegalArgumentException("Dice must be 1..6");
        }
        if (currentPosition < 0 || currentPosition > board.getSize()) {
            throw new IllegalArgumentException("Invalid current position");
        }

        int tentative = currentPosition + diceOutcome;

        if (tentative > board.getSize()) {
            return currentPosition;
        }

        Optional<Integer> ladderTop = board.ladderAt(tentative);
        if (ladderTop.isPresent()) {
            return ladderTop.get();
        }

        Optional<Integer> snakeTail = board.snakeAt(tentative);
        if (snakeTail.isPresent()) {
            return snakeTail.get();
        }

        return tentative;
    }

    public boolean isWinner(int position) {
        return position == board.getSize();
    }
}
