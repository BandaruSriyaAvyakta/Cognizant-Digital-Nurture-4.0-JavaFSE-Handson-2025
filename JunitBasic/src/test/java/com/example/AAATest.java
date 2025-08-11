package com.example;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class AAATest {
    private Calculator calc;
    @Before
    public void setUp() {
        calc = new Calculator();
    }
    @After
    public void tearDown() {
        calc = null;
    }
    @Test
    public void testAddAAA() {
        int a = 2, b = 3;
        int result = calc.add(a, b);
        assertEquals(5, result);
    }
}