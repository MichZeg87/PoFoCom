package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flightresult = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure)) {
                flightresult.add(flight);
            }

        }
        return flightresult;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flightresult = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival)) {
                flightresult.add(flight);
            }
        }
        return flightresult;
    }



}
