package com.kodilla.good.patterns.fooftodoor;

public class ExtraFoodShop implements Supplier {
    @Override
    public boolean process(Order order) {
        System.out.println("Processing order: " + order.getProduct());
        return true;
    }
}
