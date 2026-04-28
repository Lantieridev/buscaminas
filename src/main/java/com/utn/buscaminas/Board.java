package com.utn.buscaminas;

import java.util.Random;

public class Board {
    private final int size;
    private final int minesCount;
    private final Cell[][] grid;

    public Board(Difficulty difficulty) {
        this.size = difficulty.getSize();
        this.minesCount = difficulty.getMines();
        this.grid = new Cell[size][size];
        initializeGrid();
        placeMines();
        calculateAdjacentMines();
    }

    private void initializeGrid() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = new Cell();
            }
        }
    }

    private void placeMines() {
        Random random = new Random();
        int placedMines = 0;
        while (placedMines < minesCount) {
            int r = random.nextInt(size);
            int c = random.nextInt(size);
            if (!grid[r][c].isMined()) {
                grid[r][c].setMined(true);
                placedMines++;
            }
        }
    }

    private void calculateAdjacentMines() {
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (!grid[r][c].isMined()) {
                    grid[r][c].setAdjacentMines(countMinesAround(r, c));
                }
            }
        }
    }

    private int countMinesAround(int row, int col) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int ni = row + i;
                int nj = col + j;
                if (ni >= 0 && ni < size && nj >= 0 && nj < size) {
                    if (grid[ni][nj].isMined()) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public Cell getCell(int r, int c) {
        if (r < 0 || r >= size || c < 0 || c >= size) {
            return null;
        }
        return grid[r][c];
    }

    public int getSize() {
        return size;
    }

    public int getMinesCount() {
        return minesCount;
    }

    public boolean allSafeCellsRevealed() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (!grid[i][j].isMined() && !grid[i][j].isRevealed()) {
                    return false;
                }
            }
        }
        return true;
    }
}
