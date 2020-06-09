package com.kodilla.good.patterns.fooftodoor;

public class Order {
    private String product;
    private String supplier;
    private int quantity;

    public Order(String product, String supplier, int quantity) {
        this.product = product;
        this.supplier = supplier;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public String getSupplier() {
        return supplier;
    }

    public int getQuantity() {
        return quantity;
    }
}