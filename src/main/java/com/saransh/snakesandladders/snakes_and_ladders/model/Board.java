package com.saransh.snakesandladders.snakes_and_ladders.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Board {
    private final int size;
    private final Map<Integer, Integer> snakes = new HashMap<>();
    private final Map<Integer, Integer> ladders = new HashMap<>();

    public Board(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void addSnake(int head, int tail) {
        snakes.put(head, tail);
    }

    public void addLadder(int bottom, int top) {
        ladders.put(bottom, top);
    }

    public Optional<Integer> snakeAt(int position) {
        return Optional.ofNullable(snakes.get(position));
    }

    public Optional<Integer> ladderAt(int position) {
        return Optional.ofNullable(ladders.get(position));
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
