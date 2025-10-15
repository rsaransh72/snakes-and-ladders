package com.saransh.snakesandladders.snakes_and_ladders.model;

import java.util.*;

public class Board {
    private final int size;
    private final Map<Integer, Integer> ladderMap = new HashMap<>();
    private final Map<Integer, Integer> snakeMap = new HashMap<>();

    public Board(int size) { this.size = size; }

    public int getSize() { return size; }

    public static Board ofSize100() { return new Board(100); }

    public Board addLadder(int bottom, int top) {
        ladderMap.put(bottom, top); return this;
    }

    public Board addSnake(int head, int tail) {
        snakeMap.put(head, tail); return this;
    }

    public Optional<Integer> ladderAt(int pos) { return Optional.ofNullable(ladderMap.get(pos)); }
    public Optional<Integer> snakeAt(int pos) { return Optional.ofNullable(snakeMap.get(pos)); }

    public static Board withLadder(int bottom, int top) {
        Board b = new Board(100);
        b.addLadder(bottom, top);
        return b;
    }
    public static Board withSnake(int head, int tail) {
        Board b = new Board(100);
        b.addSnake(head, tail);
        return b;
    }
    public static Board defaultBoard() {
        Board board = new Board(100);
        board.addLadder(7, 33);
        board.addLadder(37, 85);
        board.addLadder(51, 72);
        board.addLadder(22, 58);
        board.addSnake(36, 19);
        board.addSnake(65, 35);
        board.addSnake(87, 32);
        board.addSnake(99, 10);
        return board;
    }

}