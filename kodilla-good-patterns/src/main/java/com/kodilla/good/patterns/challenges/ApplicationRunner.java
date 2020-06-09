package com.kodilla.good.patterns.challenges;

public class ApplicationRunner {
    public static void main(String[] args) {
        ProductOrderService service = new ProductOrderService(new EmailService(), new Shop(),
                new ShopRepo());
        Order order = new Order(new User("Jack", "Jack"), "Iron", 1);
        System.out.println(service.process(order));
    }
}