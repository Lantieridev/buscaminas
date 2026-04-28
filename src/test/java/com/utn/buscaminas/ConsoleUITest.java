package com.utn.buscaminas;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

public class ConsoleUITest {

    @Test
    public void testUIQuit() {
        // Simulate: Name, Difficulty 1, Q (quit), N (don't play again)
        String input = "TestPlayer\n1\nQ\nN\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        
        ConsoleUI ui = new ConsoleUI();
        // Since start() enters a loop, we need to ensure it terminates
        // With the 'N' at the end, it should terminate.
        ui.start();
        
        // No exceptions means it worked
    }

    @Test
    public void testUIInvalidInput() {
        // Simulate: Name, Difficulty 1, Invalid coord, Q, N
        String input = "TestPlayer\n1\ninvalid\nQ\nN\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        
        ConsoleUI ui = new ConsoleUI();
        ui.start();
    }
}
