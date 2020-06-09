package com.kodilla.good.patterns.challenges;

public interface ShopRepository {
    void order(User user, String product, int quantity);
}
