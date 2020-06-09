package com.kodilla.good.patterns.fooftodoor;

public class GlutenFreeShop implements Supplier {

    @Override
    public boolean process(Order order) {
        System.out.println("Processing order: " + order.getProduct());
        return false;
    }
}
