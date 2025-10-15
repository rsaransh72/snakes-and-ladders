package com.saransh.snakesandladders.snakes_and_ladders;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GameEngineBoundaryTest {
    @Test
    void shouldNotMoveBeyond100() {
        GameEngine engine = new GameEngine();
        assertEquals(96, engine.move(96, 5));
    }
}
