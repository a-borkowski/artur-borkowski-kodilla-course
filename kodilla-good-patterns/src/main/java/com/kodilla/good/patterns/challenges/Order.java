package com.kodilla.good.patterns.challenges;

public class Order {
    private User user;
    private String product;
    private int quantity;

    public User getUser() {
        return user;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Order(User user, String product, int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
