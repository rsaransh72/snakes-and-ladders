package com.saransh.snakesandladders.snakes_and_ladders;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.saransh.snakesandladders.snakes_and_ladders.model.Board;

class GameEngineValidationTest {

    @Test
    void shouldThrowWhenDiceOutOfRange() {
        GameEngine engine = new GameEngine(Board.defaultBoard());
        assertThrows(IllegalArgumentException.class, () -> engine.move(0, 0));
        assertThrows(IllegalArgumentException.class, () -> engine.move(0, 7));
    }

    @Test
    void shouldThrowWhenPositionInvalid() {
        GameEngine engine = new GameEngine(Board.defaultBoard());
        assertThrows(IllegalArgumentException.class, () -> engine.move(-1, 3));
        assertThrows(IllegalArgumentException.class, () -> engine.move(101, 2));
    }
}