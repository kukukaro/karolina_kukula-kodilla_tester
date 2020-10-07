package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightRepositoryTest {

    FlightRepository flightRepository = new FlightRepository();


    @Test
    public void shouldAddCorrectFlight() {
        flightRepository.addFlight("Oslo", "Londyn");
        List<Flight> expectedFlightRepository = new ArrayList<>();
        expectedFlightRepository.add(new Flight("Oslo", "Londyn"));
        assertEquals(expectedFlightRepository, flightRepository.getFlights());
    }

    @Test
    public void shouldNotAddTheSameFlight() {
        flightRepository.addFlight("Rzym", "Krakow");
        flightRepository.addFlight("Rzym", "Krakow");
        List<Flight> expectedFlightRepository = new ArrayList<>();
        expectedFlightRepository.add(new Flight("Rzym", "Krakow"));
        assertEquals(expectedFlightRepository, flightRepository.getFlights());
    }

    @Test
    public void shouldNotAddEmptyDepartureFlight() {
        flightRepository.addFlight("", "Krakow");
        assertEquals(true, flightRepository.getFlights().isEmpty());
    }

    @Test
    public void shouldNotAddEmptyArrivalFlight() {
        flightRepository.addFlight("Ryga", "");
        assertEquals(true, flightRepository.getFlights().isEmpty());
    }

    @Test
    public void shouldNotAddEmptyFlight() {
        flightRepository.addFlight("", "");
        assertEquals(true, flightRepository.getFlights().isEmpty());
    }

    @Test
    public void shouldNotAddNullFlight() {
        flightRepository.addFlight(null, null);
        assertEquals(true, flightRepository.getFlights().isEmpty());
    }
    @Test
    public void shouldNotAddNullArrivalFlight() {
        flightRepository.addFlight("Ryga", null);
        assertEquals(true, flightRepository.getFlights().isEmpty());
    }

    @Test
    public void shouldNotAddNullDepartureFlight() {
        flightRepository.addFlight(null, "Krakow");
        assertEquals(true, flightRepository.getFlights().isEmpty());
    }
}