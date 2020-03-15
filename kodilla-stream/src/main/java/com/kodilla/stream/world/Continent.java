package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    List<Country> theContinent = new ArrayList<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country theCountry) {
        theContinent.add(theCountry);
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getTheContinent() {
        return theContinent;
    }
}
