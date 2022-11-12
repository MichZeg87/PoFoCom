package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTestSuite {

    PrimeChecker checker = new PrimeChecker();
    private static  int count = 0;

    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber() {
        checker.incrementCount();
        count++;
        System.out.println("Count: " + checker.getCount() + " Test number " + count);
        boolean result = checker.isPrime(14);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingPrimeNumber() {
        count++;
        checker.incrementCount();
        boolean result = checker.isPrime(13);
        System.out.println("Count: " + checker.getCount() + " Test number " + count);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingTwo() {
        boolean result = checker.isPrime(2);
        checker.incrementCount();
        count++;
        System.out.println("Count: " + checker.getCount() + " Test number " + count);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingOne() {
        boolean result = checker.isPrime(1);
        checker.incrementCount();
        count++;
        System.out.println("Count: " + checker.getCount() + " Test number " + count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingZero() {
        boolean result = checker.isPrime(0);
        checker.incrementCount();
        count++;
        System.out.println("Count: " + checker.getCount() + " Test number " + count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingNegativeNumber() {
        boolean result = checker.isPrime(-6);
        checker.incrementCount();
        count++;
        System.out.println("Count: " + checker.getCount() + " Test number " + count);
        assertFalse(result);
    }
}
