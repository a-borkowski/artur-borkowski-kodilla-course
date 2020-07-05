package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMacBuilder() {

        //Given
        BigMac bigMac = new BigMac.BigMacBulider()
                .bun("normal")
                .burgers(1)
                .sauce("1000islands")
                .ingredient("lettuce")
                .ingredient("onion")
                .ingredient("bacon")
                .ingredient("chilli")
                .ingredient("cheese")
                .build();
        System.out.println(bigMac.toString());

        //When
        String bun = bigMac.getBun();
        int howManyBurgers = bigMac.getBurgers();
        int howManyIngredients = bigMac.getIngredients().size();

        //Then
        Assert.assertEquals("normal", bun);
        Assert.assertEquals(1, howManyBurgers);
        Assert.assertEquals(5, howManyIngredients);
    }
}