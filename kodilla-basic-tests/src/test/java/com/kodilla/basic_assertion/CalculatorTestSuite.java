package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTestSuite {
    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        int a = 15;
        int b = 18;
        int subResult = calculator.subtract(a, b);
        assertEquals(-3, subResult);
    }

    @Test
    public void testSquareForPositiveNumbers() {
        int a = 5;
        int squareResult = calculator.square(a);
        assertEquals(25, squareResult);
    }

    @Test
    public void testSquareForNegativeNumbers() {
        int a = -9;
        int squareResult = calculator.square(a);
        assertEquals(81, squareResult);
    }

    @Test
    public void testSquareForZero() {
        int a = 0;
        int squareResult = calculator.square(a);
        assertEquals(0, squareResult);
    }
}
