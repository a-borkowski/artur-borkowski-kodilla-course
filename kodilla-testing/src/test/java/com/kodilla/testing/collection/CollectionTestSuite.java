package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("The Case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Siute: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator underTest = new OddNumbersExterminator();
        List<Integer> data = new ArrayList<>();
        //When
        List<Integer> result = underTest.exterminate(data);
        //Then
        Assert.assertEquals(0,result.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator underTest1 = new OddNumbersExterminator();
        List<Integer> data1 = new ArrayList<>();
        data1.add(10);
        data1.add(19);
        data1.add(41);
        data1.add(51);
        data1.add(61);
        data1.add(20);
        //When
        List<Integer> result1 = underTest1.exterminate(data1);
        System.out.println(result1);
        //Then
        Assert.assertEquals(2,result1.size());
    }
}