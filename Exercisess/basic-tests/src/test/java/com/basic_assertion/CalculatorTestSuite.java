package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.subtract(a, b);
        assertEquals(-3, sumResult);
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        double a = 5;
        double squareResult= calculator.square(a);
        assertEquals(25, squareResult);
    }

    @Test
    public void testSquareZero() {
        Calculator calculator = new Calculator();
        double a = 0;
        double squareResult= calculator.square(a);
        assertEquals(0, squareResult);
    }
    @Test
    public void testSquareUnder() {
        Calculator calculator = new Calculator();
        double a = 0.13579;
        double squareResult = calculator.square(a);
        assertEquals(0.01843, squareResult,0.001);
    }
}