package com.utn.buscaminas;

public class Cell {
    private boolean isMined;
    private boolean isRevealed;
    private int adjacentMines;

    public Cell() {
        this.isMined = false;
        this.isRevealed = false;
        this.adjacentMines = 0;
    }

    public boolean isMined() {
        return isMined;
    }

    public void setMined(boolean mined) {
        isMined = mined;
    }

    public boolean isRevealed() {
        return isRevealed;
    }

    public void reveal() {
        isRevealed = true;
    }

    public int getAdjacentMines() {
        return adjacentMines;
    }

    public void setAdjacentMines(int adjacentMines) {
        this.adjacentMines = adjacentMines;
    }

    @Override
    public String toString() {
        if (!isRevealed) {
            return "[?]";
        }
        if (isMined) {
            return "[*]";
        }
        return "[" + adjacentMines + "]";
    }
}
