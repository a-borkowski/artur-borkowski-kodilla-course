package com.kodilla.good.patterns.fooftodoor;

public class WareHouse {

    public boolean process(Order order) {
        Supplier supplier = SupplierFactory.getSupplier(order.getSupplier());
        boolean result = supplier.process(order);
        System.out.println(result);
        return result;
    }
}