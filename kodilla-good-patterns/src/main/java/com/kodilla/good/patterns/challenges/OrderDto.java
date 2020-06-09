package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private final User user;
    private final boolean ordered;

    public OrderDto(User user, boolean isOrdered) {
        this.user = user;
        this.ordered = isOrdered;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "user=" + user +
                ", ordered=" + ordered +
                '}';
    }
}
