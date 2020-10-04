package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {

    private List<Flight> flights = new LinkedList<>();
    private Set<String> cities = new HashSet<>();

    public void addFlight(String departure, String arrival) {
        for (Flight flight : flights) {
            if (flight.getArrival().equals(arrival) && flight.getDeparture().equals(departure)) {
                System.out.println("This flight is already added to flight repository.");
                return;
            }
        }
        flights.add(new Flight(departure, arrival));
    }


    public Set<String> getFlightsTable(String city) {

        for (Flight flight : flights) {
            if (flight.getArrival().equals(city))
                cities.add(flight.getDeparture());

            if (flight.getDeparture().equals(city))
                cities.add(flight.getArrival());
        }

       return cities;

    }

    public void printAllFlights() {
        System.out.println("Departure --- Arrival");
        for (Flight flight : flights) {
            System.out.println(flight.getDeparture() + " --- " + flight.getArrival());
        }
    }

    public void printAllCities() {
        System.out.println("List of Cities: ");
        for (String city : cities) {
            System.out.println(city);
        }
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
