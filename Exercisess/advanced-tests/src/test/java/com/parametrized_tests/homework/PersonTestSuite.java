package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {


    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSource#providePersonForTestingBmi")
    public void shouldCalculateBmi(String input, double height, double weight) {
        Person person = new Person(height, weight);
        assertEquals(input, person.getBMI());

    }
}

