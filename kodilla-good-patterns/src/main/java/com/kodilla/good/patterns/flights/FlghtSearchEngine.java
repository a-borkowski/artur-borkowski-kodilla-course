package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlghtSearchEngine {

    private List<Flight> flights() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("KRK", "WAW"));
        flights.add(new Flight("KRK", "GDA"));
        flights.add(new Flight("GDA", "WAW"));
        flights.add(new Flight("KTW", "WAW"));
        flights.add(new Flight("WAW", "GDA"));
        flights.add(new Flight("KTW", "WRO"));
        return flights;
    }

    public List<Flight> findFlightsFrom(String from) {
        return flights().stream()
                .filter(f -> f.getFrom().equals(from))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsTo(String to) {
        return flights().stream()
                .filter(f -> f.getTo().equals(to))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsThrough(String from, String through , String to) {
        List<Flight> result = flights().stream()
                .filter(f -> f.getFrom().equals(from))
                .filter(f -> f.getTo().equals(through))
                .collect(Collectors.toList());
        result.addAll(flights().stream()
                .filter(f -> f.getFrom().equals(through))
                .filter(f -> f.getTo().equals(to))
                .collect(Collectors.toList()));
        return result;
    }
}
