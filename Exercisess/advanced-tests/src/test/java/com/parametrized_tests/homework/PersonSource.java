package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSource {
    static Stream<Arguments> providePersonForTestingBmi() {
        return Stream.of(
                Arguments.of("Very severely underweight", 1.80, 40),
                Arguments.of("Severely underweight", 1.8, 51),
                Arguments.of("Underweight", 1.8, 55),
                Arguments.of("Normal (healthy weight)", 1.8, 60),
                Arguments.of("Overweight", 1.6, 75),
                Arguments.of("Obese Class I (Moderately obese)", 1.5, 70),
                Arguments.of("Obese Class II (Severely obese)", 1.4, 70),
                Arguments.of("Obese Class III (Very severely obese)", 1.7, 120),
                Arguments.of("Obese Class IV (Morbidly Obese)", 1.7, 140),
                Arguments.of("Obese Class V (Super Obese)", 1.6, 140),
                Arguments.of("Obese Class VI (Hyper Obese)", 1.6, 160)

        );
    }// przerób liczby naw\zrost i wagę
}
