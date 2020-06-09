package com.kodilla.good.patterns.fooftodoor;

public class ApplicationApp {
    public static void main(String[] args) {
        Order order1 = new Order("Butter", SupplierFactory.GLUTEN_FREE_SHOP, 2);
        Order order2 = new Order("Butter", SupplierFactory.EXTRA_FOOD_SHOP, 2);
        Order order3 = new Order("Butter", SupplierFactory.HEALTHY_FOOD_SHOP, 2);
        WareHouse wareHouse = new WareHouse();
        wareHouse.process(order1);
        wareHouse.process(order2);
        wareHouse.process(order3);
    }
}