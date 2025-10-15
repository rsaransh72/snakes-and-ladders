package com.saransh.snakesandladders.snakes_and_ladders;

import org.junit.jupiter.api.Test;

import com.saransh.snakesandladders.snakes_and_ladders.model.Board;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameEngineSnakesLaddersTest {
    @Test
    void ladderShouldTakeYouUp() {
        Board board = Board.withLadder(7, 33);
        GameEngine engine = new GameEngine(board);
        assertEquals(33, engine.move(0, 7));
    }

    @Test
    void snakeShouldTakeYouDown() {
        Board board = Board.withSnake(87, 32);
        GameEngine engine = new GameEngine(board);
        assertEquals(32, engine.move(83, 4));
    }
}