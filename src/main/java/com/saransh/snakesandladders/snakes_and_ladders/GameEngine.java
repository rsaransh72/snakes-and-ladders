package com.saransh.snakesandladders.snakes_and_ladders;

import com.saransh.snakesandladders.snakes_and_ladders.model.Board;

public class GameEngine {
    private final Board board;

    public GameEngine() { this.board = Board.ofSize100(); }
    public GameEngine(Board board) { this.board = board; }

    public int move(int currentPosition, int diceOutcome) {
        int tentative = currentPosition + diceOutcome;
        if (tentative > board.getSize()) return currentPosition;

        var ladder = board.ladderAt(tentative);
        if (ladder.isPresent()) return ladder.get();

        var snake = board.snakeAt(tentative);
        if (snake.isPresent()) return snake.get();

        return tentative;
    }
}

