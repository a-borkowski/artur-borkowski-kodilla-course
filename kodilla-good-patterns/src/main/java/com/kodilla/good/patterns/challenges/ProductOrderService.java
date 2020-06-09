package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private ShopService shopService;
    private ShopRepository shopRepository;

    public ProductOrderService(final InformationService informationService,
                           final ShopService shopService,
                           final ShopRepository shopRepository) {
        this.informationService = informationService;
        this.shopService = shopService;
        this.shopRepository = shopRepository;
    }

    public OrderDto process(final Order order) {
        boolean isRented = shopService.rent(order.getUser(), order.getProduct(),
                order.getQuantity());

        if (isRented) {
            informationService.inform(order.getUser());
            shopRepository.order(order.getUser(), order.getProduct(), order.getQuantity());
            return new OrderDto(order.getUser(), true);
        } else {
            return new OrderDto(order.getUser(), false);
        }
    }
}