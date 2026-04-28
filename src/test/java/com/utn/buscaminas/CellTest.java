package com.utn.buscaminas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CellTest {

    @Test
    public void testCellToString() {
        Cell cell = new Cell();
        assertEquals("[?]", cell.toString());
        
        cell.reveal();
        assertEquals("[0]", cell.toString());
        
        cell.setAdjacentMines(3);
        assertEquals("[3]", cell.toString());
        
        cell.setMined(true);
        assertEquals("[*]", cell.toString());
    }
    
    @Test
    public void testCellState() {
        Cell cell = new Cell();
        assertFalse(cell.isMined());
        assertFalse(cell.isRevealed());
        assertEquals(0, cell.getAdjacentMines());
        
        cell.setMined(true);
        assertTrue(cell.isMined());
        
        cell.reveal();
        assertTrue(cell.isRevealed());
        
        cell.setAdjacentMines(5);
        assertEquals(5, cell.getAdjacentMines());
    }
}
