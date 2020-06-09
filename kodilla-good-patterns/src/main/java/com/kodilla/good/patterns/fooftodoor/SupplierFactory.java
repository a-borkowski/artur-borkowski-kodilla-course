package com.kodilla.good.patterns.fooftodoor;

public class SupplierFactory {

    public static final String HEALTHY_FOOD_SHOP = "HealthyFoodShop";
    public static final String GLUTEN_FREE_SHOP = "GlutenFreeShop";
    public static final String EXTRA_FOOD_SHOP = "ExtraFoodShop";

    public static Supplier getSupplier(String supplier) {
        switch(supplier){
            case HEALTHY_FOOD_SHOP: return new HealthyFoodShop();
            case GLUTEN_FREE_SHOP: return new GlutenFreeShop();
            case EXTRA_FOOD_SHOP: return new ExtraFoodShop();
            default: return null;
        }
    }
}
