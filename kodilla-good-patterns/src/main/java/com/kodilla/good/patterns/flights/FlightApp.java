package com.kodilla.good.patterns.flights;

public class FlightApp {
    public static void main(String[] args) {
        FlghtSearchEngine flights = new FlghtSearchEngine();
        System.out.println(flights.findFlightsFrom("KRK"));
        System.out.println(flights.findFlightsTo("WAW"));
        System.out.println(flights.findFlightsThrough("KTW", "WAW", "GDA"));
    }
}
