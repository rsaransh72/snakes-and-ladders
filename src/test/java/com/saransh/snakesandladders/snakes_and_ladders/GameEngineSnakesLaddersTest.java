package com.saransh.snakesandladders.snakes_and_ladders;

import com.saransh.snakesandladders.snakes_and_ladders.model.Board;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameEngineSnakesLaddersTest {

    @Test
    void ladderShouldTakeYouUp() {
        Board board = new Board(100);
        board.addLadder(7, 33);
        GameEngine engine = new GameEngine(board);

        int newPosition = engine.move(1, 6);
        assertEquals(33, newPosition, "Should climb ladder from 7 to 33");
    }

    @Test
    void snakeShouldBringYouDown() {
        Board board = new Board(100);
        board.addSnake(87, 32);
        GameEngine engine = new GameEngine(board);

        int newPosition = engine.move(83, 4);
        assertEquals(32, newPosition, "Should slide down snake from 87 to 32");
    }
}
