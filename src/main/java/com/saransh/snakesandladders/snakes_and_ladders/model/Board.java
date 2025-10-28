package com.saransh.snakesandladders.snakes_and_ladders.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Board {
    private final int size;
    private final List<Snake> snakes = new ArrayList<>();
    private final List<Ladder> ladders = new ArrayList<>();

    public Board(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void addSnake(int head, int tail) {
        snakes.add(new Snake(head, tail));
    }

    public void addLadder(int bottom, int top) {
        ladders.add(new Ladder(bottom, top));
    }

    public Optional<Integer> snakeAt(int position) {
        return snakes.stream()
        .filter(snake -> snake.getHead() == position)
        .findFirst()
        .map(Snake::getTail);
}


    public Optional<Integer> ladderAt(int position) {
        return ladders.stream()
        		.filter(ladder -> ladder.getBottom() == position)
                .findFirst()
                .map(Ladder::getTop);
}

    public static Board defaultBoard() {
        Board board = new Board(100);

        board.addLadder(7, 33);
        board.addLadder(22, 58);
        board.addLadder(37, 85);
        board.addLadder(51, 72);

        board.addSnake(36, 19);
        board.addSnake(65, 35);
        board.addSnake(87, 32);
        board.addSnake(99, 10);

        return board;
    }

    public static Board withLadder(int bottom, int top) {
        Board board = new Board(100);
        board.addLadder(bottom, top);
        return board;
    }

    public static Board withSnake(int head, int tail) {
        Board board = new Board(100);
        board.addSnake(head, tail);
        return board;
    }
}
