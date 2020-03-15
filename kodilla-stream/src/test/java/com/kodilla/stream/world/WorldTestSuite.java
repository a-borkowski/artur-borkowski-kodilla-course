package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country(new BigDecimal("1000000"));
        Country germany = new Country(new BigDecimal("2000000"));
        Country china = new Country(new BigDecimal("4000000"));
        Country japan = new Country(new BigDecimal("5000000"));
        Country brazil = new Country(new BigDecimal("7000000"));
        Country argentina = new Country(new BigDecimal("8000000"));

        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(germany);

        Continent asia = new Continent("Asia");
        asia.addCountry(china);
        asia.addCountry(japan);

        Continent southAmerica = new Continent("South America");
        southAmerica.addCountry(brazil);
        southAmerica.addCountry(argentina);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(southAmerica);

        BigDecimal expectedResult = new BigDecimal("27000000");

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(expectedResult, result);
    }
}