package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airport = new HashMap<>();
        airport.put("Krakow", true);
        airport.put("Warsaw", true);

        if (airport.containsKey(flight.getArrivalAirport())) {
            System.out.println("Arrival airport available - " + flight.getArrivalAirport());
        } else
            throw new RouteNotFoundException("No airport to search");
    }
}