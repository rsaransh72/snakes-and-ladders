package com.saransh.snakesandladders.snakes_and_ladders;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GameEngineTest {

    @Test
    void shouldMovePlayerByDiceValue() {
        GameEngine engine = new GameEngine();
        int newPosition = engine.move(4, 5);
        assertEquals(9, newPosition);
    }
}
