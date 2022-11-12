package com.kodilla.basic_assertion;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double square(double a){
        return a * a;
    }

    public double delta(double expected, double actual) {
        double delta =  expected - actual ;
        return delta;
    }
}

