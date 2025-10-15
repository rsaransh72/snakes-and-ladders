package com.saransh.snakesandladders.snakes_and_ladders;

public class GameEngine {

    public int move(int currentPosition, int diceOutcome) {
    	int tentative = currentPosition + diceOutcome;
        if (tentative > 100) return currentPosition;
        return tentative;
    }
}

