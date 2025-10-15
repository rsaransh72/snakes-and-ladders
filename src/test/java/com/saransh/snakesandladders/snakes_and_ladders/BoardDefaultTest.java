package com.saransh.snakesandladders.snakes_and_ladders;

import org.junit.jupiter.api.Test;

import com.saransh.snakesandladders.snakes_and_ladders.model.Board;

import static org.junit.jupiter.api.Assertions.*;

class BoardDefaultTest {
    @Test
    void defaultBoardShouldContainFourSnakesAndLadders() {
        Board board = Board.defaultBoard();
        assertTrue(board.ladderAt(7).isPresent());
        assertTrue(board.snakeAt(87).isPresent());
    }
}