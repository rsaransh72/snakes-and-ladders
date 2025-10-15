package com.saransh.snakesandladders.snakes_and_ladders;

import com.saransh.snakesandladders.snakes_and_ladders.model.Board;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Board board = Board.defaultBoard();              
        GameEngine engine = new GameEngine(board);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Snakes & Ladders");
        System.out.println("Enter <current>,<dice> ");
        System.out.println("Note: dice must be 1..6, position 0..100.");
        while (true) {
            System.out.print("Input: ");
            String line = scanner.nextLine();
            if (line == null) break;
            line = line.trim();
            if (line.equalsIgnoreCase("exit")) {
                System.out.println("Exiting.");
                break;
            }
            if (line.isEmpty()) {
                System.out.println("Please provide input or type 'exit'.");
                continue;
            }

            String[] parts = line.contains(",") ? line.split(",") : line.split("\\s+");
            if (parts.length != 2) {
                System.out.println("Invalid format");
                continue;
            }

            try {
                int current = Integer.parseInt(parts[0].trim());
                int dice = Integer.parseInt(parts[1].trim());

                int newPos = engine.move(current, dice);

                if (newPos == current && current + dice > board.getSize()) {
                    System.out.printf("New position: %d%n", current);
                } else {
                    if (engine.isWinner(newPos)) {
                        System.out.println("Yay!! You won!!");
                        break;
                    } else {
                        System.out.printf("New position: %d%n", newPos);
                    }
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid numbers. Ensure you entered integers for current and dice.");
            } catch (IllegalArgumentException iae) {
                System.out.println("Invalid input: " + iae.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}