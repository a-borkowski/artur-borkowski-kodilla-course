package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaTestSuite {
    @Test
    public void testPizzaDecorator(){
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new BaconPizzaDecortator(pizza);
        pizza = new MushroomPizzaDecorator(pizza);
        //When
        BigDecimal result = pizza.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(24), result);
    }

}