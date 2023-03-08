package com.parametrized_tests.homework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GamblingMachine {
    public int howManyWins(Set<Integer> userNumbers) throws InvalidNumbersException {
        validateNumbers(userNumbers); // metoda validateNumbers zawiera kolekcje userNumbers
        Set<Integer> computerNumbers = generateComputerNumbers();
        int count = 0;
        for (Integer number : userNumbers) {
            if (computerNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }

    private void validateNumbers(Set<Integer> numbers) throws InvalidNumbersException { // sprawdza poprawność wprowadzonych cyfr i wielkości kolekcji, rzuca wyjątek
        if (numbers.size() != 6) {
            throw new InvalidNumbersException(); // rzuca wyjącek jeśli wielkość kolekcji numbers nie równa się 6
        }

        if (numbers.stream().anyMatch(number -> number < 1 || number > 49)) { // ||- lub, rzuca wyjątek jeśli liczby nie są z przedziału od 1-49
            throw new InvalidNumbersException();
        }
    }

    private Set<Integer> generateComputerNumbers() { // zamknięte w zmiennej computerNumbers
        Set<Integer> numbers = new HashSet<>();
        Random generator = new Random();
        while (numbers.size() < 6) { // przerywa pętle jeśli wielkość kolekcji jest równa 6
            numbers.add(generator.nextInt(49) + 1); // wylosuj liczbę od 1-49 dodaj do kolekcji
        }
        return numbers;
    }

}
