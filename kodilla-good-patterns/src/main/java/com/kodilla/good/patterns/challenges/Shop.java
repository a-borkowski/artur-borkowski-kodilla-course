package com.kodilla.good.patterns.challenges;

import java.util.Random;

public class Shop implements ShopService {

    @Override
    public boolean rent(User user, String product, int quantity) {
        Random random = new Random();
        System.out.println(user + "," + product + "," + quantity);
        return random.nextBoolean();
    }
}
