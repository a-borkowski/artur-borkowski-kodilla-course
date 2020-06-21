package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)

public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;

    @Test
    public void testAdd() {
        //Given

        //When
        double result = calculator.add(2, 5);

        //Then
        Assert.assertEquals(7, result, 0);
    }

    @Test
    public void testDoublesub() {
        //Given

        //When
        double result = calculator.doublesub(5, 1);

        //Then
        Assert.assertEquals(4, result, 0);
    }

    @Test
    public void testDoublemul() {
        //Given

        //When
        double result = calculator.doublemul(4, 2);

        //Then
        Assert.assertEquals(8, result, 0);
    }

    @Test
    public void testDoublediv() {
        //Given

        //When
        double result = calculator.doublediv(4, 2);

        //Then
        Assert.assertEquals(2, result, 0);
    }
}