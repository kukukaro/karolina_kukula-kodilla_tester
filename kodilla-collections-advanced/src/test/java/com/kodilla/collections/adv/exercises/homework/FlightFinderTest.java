package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class FlightFinderTest {
    FlightRepository flightRepository = new FlightRepository();
    FlightFinder flightFinder = new FlightFinder(flightRepository);

    @BeforeEach
    void initFlights() {
        flightRepository.addFlight("Krakow", "Amsterdam");
        flightRepository.addFlight("Warszawa", "Oslo");
        flightRepository.addFlight("Oslo", "Warszawa");
        flightRepository.addFlight("Krakow", "Londyn");
    }

    @Test
    public void shouldReturnEmptyListForFlightsFromNullSearch() {
        assertEquals(true, flightFinder.findFlightsFrom(null).isEmpty());
    }

    @Test
    public void shouldReturnEmptyListForFlightsToNullSearch() {
        assertEquals(true, flightFinder.findFlightsTo(null).isEmpty());
    }

    @Test
    public void shouldReturnEmptyListForFlightsFromEmptyStringSearch() {
        assertEquals(true, flightFinder.findFlightsFrom("").isEmpty());
    }

    @Test
    public void shouldReturnEmptyListForFlightsToEmptyStringSearch() {
        assertEquals(true, flightFinder.findFlightsTo("").isEmpty());
    }

    @Test
    public void shouldReturnCorrectListForFlightsFromSearch() {
        List<Flight> expectedList = new ArrayList<>();
        List<Flight> result = flightFinder.findFlightsFrom("Krakow");
        expectedList.add(new Flight("Krakow", "Amsterdam"));
        expectedList.add(new Flight("Krakow", "Londyn"));
        assertEquals(expectedList, result);
    }

    @Test
    public void shouldReturnCorrectListForFlightsToSearch() {
        List<Flight> expectedList = new ArrayList<>();
        List<Flight> result = flightFinder.findFlightsTo("Oslo");
        expectedList.add(new Flight("Warszawa", "Oslo"));
        assertEquals(expectedList, result);
    }
}