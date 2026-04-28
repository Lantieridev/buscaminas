package com.utn.buscaminas;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ConsoleUI {
    private final Scanner scanner;
    private final Map<String, Integer> playerWins;

    public ConsoleUI() {
        this.scanner = new Scanner(System.in);
        this.playerWins = new HashMap<>();
    }

    public void start() {
        System.out.println("========================================");
        System.out.println("       BIENVENIDO AL BUSCAMINAS        ");
        System.out.println("========================================");

        System.out.print("Ingrese su nombre: ");
        String playerName = scanner.nextLine();

        boolean keepPlaying = true;
        while (keepPlaying) {
            playRound(playerName);
            System.out.print("\n¿Desea jugar otra partida? (S/N): ");
            String choice = scanner.nextLine().toUpperCase();
            keepPlaying = choice.equals("S");
        }

        showFinalStats();
        System.out.println("¡Gracias por jugar!");
    }

    private void playRound(String playerName) {
        System.out.println("\nSeleccione dificultad:");
        System.out.println("1. Fácil (10x10, 10 minas)");
        System.out.println("2. Difícil (20x20, 20 minas)");
        System.out.print("Opción: ");

        Difficulty difficulty = Difficulty.EASY;
        try {
            int opt = Integer.parseInt(scanner.nextLine());
            if (opt == 2) difficulty = Difficulty.HARD;
        } catch (NumberFormatException e) {
            System.out.println("Opción no válida, usando Fácil por defecto.");
        }

        Game game = new Game(playerName, difficulty);

        while (!game.isGameOver()) {
            displayBoard(game.getBoard());
            System.out.print("\nIngrese coordenadas (fila columna) o 'Q' para salir: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("Q")) {
                System.out.println("Partida abandonada.");
                return;
            }

            try {
                String[] parts = input.split("\\s+");
                if (parts.length != 2) throw new Exception();

                int r = Integer.parseInt(parts[0]);
                int c = Integer.parseInt(parts[1]);

                if (!game.revealCell(r, c)) {
                    System.out.println("Coordenada inválida o ya revelada.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Use el formato: fila columna (ej: 0 0)");
            }
        }

        displayBoard(game.getBoard());
        if (game.isWon()) {
            System.out.println("\n¡FELICITACIONES, " + playerName + "! ¡Has ganado!");
            playerWins.put(playerName, playerWins.getOrDefault(playerName, 0) + 1);
        } else {
            System.out.println("\n¡BOOM! Has tocado una mina. Fin del juego.");
        }
    }

    private void displayBoard(Board board) {
        int size = board.getSize();
        System.out.print("   ");
        for (int j = 0; j < size; j++) {
            System.out.printf("%2d ", j);
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.printf("%2d ", i);
            for (int j = 0; j < size; j++) {
                System.out.print(board.getCell(i, j).toString() + " ");
            }
            System.out.println();
        }
    }

    private void showFinalStats() {
        System.out.println("\n--- Estadísticas de Partidas Ganadas ---");
        if (playerWins.isEmpty()) {
            System.out.println("No hay victorias registradas.");
        } else {
            playerWins.forEach((name, wins) -> 
                System.out.println("Jugador: " + name + " | Victorias: " + wins));
        }
    }
}
