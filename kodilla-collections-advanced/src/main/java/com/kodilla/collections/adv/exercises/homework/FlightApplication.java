package com.kodilla.collections.adv.exercises.homework;

public class FlightApplication {

    public static void main(String[] args) {
        FlightRepository flightRepository = new FlightRepository();
        flightRepository.addFlight("Krakow", "Amsterdam");
        flightRepository.addFlight("Krakow", "Amsterdam");
        flightRepository.addFlight("Warszawa", "Oslo");
        flightRepository.addFlight("Oslo", "Warszawa");
        flightRepository.addFlight("Krakow", "Londyn");
        flightRepository.addFlight("Warszawa", "Londyn");
        flightRepository.addFlight("Warszawa", "Dublin");
        flightRepository.addFlight("Dublin", "Warszawa");
        flightRepository.addFlight("Krakow", "Warszawa");
        flightRepository.addFlight("Warszawa", "Krakow");
        flightRepository.addFlight("Krakow", "Gdansk");
        flightRepository.addFlight("Gdansk", "Krakow");


        flightRepository.getFlightsTable("Warszawa");
        flightRepository.printAllCities();

        FlightFinder finder = new FlightFinder(flightRepository);
        finder.findFlightsFrom("Krakow");
        finder.printFlightsFrom();

        }
}
