package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

public class GamblingMachineTestSuit { // test
    public GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/intUserNumbers.csv", numLinesToSkip = 1)
    public void shouldCountWins(int number1, int number2, int number3, int number4, int number5, int number6) throws InvalidNumbersException {
        Set<Integer> input = new HashSet<>();

        input.add(number1);
        input.add(number2);
        input.add(number3);
        input.add(number4);
        input.add(number5);
        input.add(number6);
        int wins = gamblingMachine.howManyWins(input);
        Assertions.assertTrue(wins >= 0 && wins <= 6);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/WrongNumber.csv", numLinesToSkip = 1)
    public void shouldReturnExceptionForWrongNumbers(int number1, int number2, int number3, int number4, int number5, int number6) {
        Set<Integer> input = new HashSet<>();

        input.add(number1);
        input.add(number2);
        input.add(number3);
        input.add(number4);
        input.add(number5);
        input.add(number6);
        Assertions.assertThrows(InvalidNumbersException.class, () ->
                gamblingMachine.howManyWins(input));

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/fiveNumbers.csv", numLinesToSkip = 1)
    public void shouldReturnExceptionForWrongNumbersOfDigits(int number1) {
        Set<Integer> input = new HashSet<>();

        input.add(number1);
        Assertions.assertThrows(InvalidNumbersException.class, () ->
                gamblingMachine.howManyWins(input));
    }
//String[] numbers = text.split(","); foreach po wszystkich wartościach z nambers input.add(Integer.parseInt(numbers[i]); parsint- zapienuia string na liczbe
}













