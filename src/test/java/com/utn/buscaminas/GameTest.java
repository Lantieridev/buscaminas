package com.utn.buscaminas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    @Test
    public void testGameWinCondition() {
        Game game = new Game("Player", Difficulty.EASY);
        Board board = game.getBoard();
        
        // Reveal all safe cells
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (!board.getCell(i, j).isMined()) {
                    game.revealCell(i, j);
                }
            }
        }
        
        assertTrue(game.isGameOver());
        assertTrue(game.isWon());
    }

    @Test
    public void testGameLossCondition() {
        Game game = new Game("Player", Difficulty.EASY);
        Board board = game.getBoard();
        
        // Find a mine and reveal it
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (board.getCell(i, j).isMined()) {
                    game.revealCell(i, j);
                    break;
                }
            }
            if (game.isGameOver()) break;
        }
        
        assertTrue(game.isGameOver());
        assertFalse(game.isWon());
    }

    @Test
    public void testRevealAlreadyRevealedCell() {
        Game game = new Game("Player", Difficulty.EASY);
        // Find a safe cell
        int r = -1, c = -1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (!game.getBoard().getCell(i, j).isMined()) {
                    r = i; c = j;
                    break;
                }
            }
            if (r != -1) break;
        }
        
        assertTrue(game.revealCell(r, c));
        assertFalse(game.revealCell(r, c)); // Second time should be false
    }
    
    @Test
    public void testRevealCellAfterGameOver() {
        Game game = new Game("Player", Difficulty.EASY);
        // Loss
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (game.getBoard().getCell(i, j).isMined()) {
                    game.revealCell(i, j);
                    break;
                }
            }
            if (game.isGameOver()) break;
        }
        
        assertFalse(game.revealCell(0, 0));
    }
}
