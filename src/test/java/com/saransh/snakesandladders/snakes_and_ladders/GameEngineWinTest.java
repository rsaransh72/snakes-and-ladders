package com.saransh.snakesandladders.snakes_and_ladders;

import org.junit.jupiter.api.Test;

import com.saransh.snakesandladders.snakes_and_ladders.model.Board;

import static org.junit.jupiter.api.Assertions.*;

class GameEngineWinTest {

    @Test
    void shouldDetectWinnerAt100() {
        GameEngine engine = new GameEngine(Board.defaultBoard());
        assertEquals(100, engine.move(97, 3));
        assertTrue(engine.isWinner(100));
    }
}