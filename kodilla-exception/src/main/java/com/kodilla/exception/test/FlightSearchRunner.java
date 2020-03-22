package com.kodilla.exception.test;

public class FlightSearchRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Warsaw", "Krakow");
        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        } finally {
            System.out.println("Search ended");
        }
    }
}