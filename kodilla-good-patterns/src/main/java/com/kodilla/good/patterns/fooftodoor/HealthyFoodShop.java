package com.kodilla.good.patterns.fooftodoor;

import java.util.Random;

public class HealthyFoodShop implements Supplier {
    @Override
    public boolean process(Order order) {
        System.out.println("Processing order: " + order.getProduct());
        Random random = new Random();
        return random.nextBoolean();
    }
}
