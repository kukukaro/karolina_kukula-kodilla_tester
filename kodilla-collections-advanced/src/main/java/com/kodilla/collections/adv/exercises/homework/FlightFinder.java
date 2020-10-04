package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    private List<Flight> flightsFrom = new ArrayList<>();
    private List<Flight> flightsTo = new ArrayList<>();
    private final FlightRepository flightRepository;

    public FlightFinder(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> findFlightsFrom(String departure) {

        for (Flight flight : flightRepository.getFlights()) {
            if (flight.getDeparture().equals(departure))
                flightsFrom.add(flight);
        }

        return flightsFrom;
    }

    public List<Flight> findFlightsTo(String arrival) {
        for (Flight flight : flightRepository.getFlights()) {
            if (flight.getArrival().equals(arrival))
                flightsTo.add(flight);
        }
        return flightsTo;
    }

    public void printFlightsFrom() {
        System.out.println("Flights from ");
        for (Flight flight : flightsFrom) {
            System.out.println(flight.getDeparture() + " --- " + flight.getArrival());
        }
    }


}
