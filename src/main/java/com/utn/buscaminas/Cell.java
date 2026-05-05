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
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String BLUE = "\u001B[34m";
        String CYAN = "\u001B[36m";

        if (!isRevealed) {
            return CYAN + "[?]" + RESET;
        }
        if (isMined) {
            return RED + "[*]" + RESET;
        }
        
        String color = switch (adjacentMines) {
            case 1 -> BLUE;
            case 2 -> GREEN;
            case 3 -> RED;
            case 4 -> YELLOW;
            default -> RESET;
        };
        
        return color + "[" + adjacentMines + "]" + RESET;
    }
}
