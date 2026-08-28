package com.exampleTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.Calculator;

class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    void testAdd() {
        int actual = c.add(10, 20);
        int expected = 30;

        assertEquals(expected, actual);
    }

    @Test
    void testSubtract() {
        int actual = c.subtract(20, 10);
        int expected = 10;

        assertEquals(expected, actual);
    }
}