package com.kodilla.basic_assertion;

public class ResultChecker {
    public static boolean assertEquals(double expected, double actual, double delta) {
        Calculator calculator = new Calculator();
        delta  = calculator.delta(actual, expected);
        return expected == actual;
    }
}
