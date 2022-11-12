package com.kodilla.collections.adv.exercises.dictionary.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;
import com.kodilla.collections.adv.exercises.dictionary.PartOfSpeech;
import com.kodilla.collections.adv.exercises.homework.Flight;
import com.kodilla.collections.adv.exercises.homework.FlightFinder;
import com.kodilla.collections.adv.exercises.homework.FlightRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuit {

    @Test
    public void TestFindFlightDeparture() {
        //given
        FlightFinder flightFinder = new FlightFinder();

        //when
        List<Flight> result = flightFinder.findFlightsFrom("London");

        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.contains(result);
        assertEquals(1, result.size());

    }

    @Test
    public void TestFindFlightArrival() {
        //given
        FlightFinder flightFinder = new FlightFinder();

        //when
        List<Flight> result = flightFinder.findFlightsTo("Barcelona");

        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.contains(result);
        assertEquals(1, result.size());
    }
}
