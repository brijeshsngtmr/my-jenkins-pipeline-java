package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testAdd() {
        Main app = new Main();
        assertEquals(5, app.add(2, 3));
    }
}
