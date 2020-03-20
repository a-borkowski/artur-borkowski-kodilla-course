package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[20];
        numbers[0] = 11;
        numbers[1] = 12;
        numbers[2] = 13;
        numbers[3] = 14;
        numbers[4] = 15;
        numbers[5] = 16;
        numbers[6] = 17;
        numbers[7] = 18;
        numbers[8] = 19;
        numbers[9] = 110;
        numbers[10] = 111;
        numbers[11] = 112;
        numbers[12] = 113;
        numbers[13] = 114;
        numbers[14] = 115;
        numbers[15] = 116;
        numbers[16] = 117;
        numbers[17] = 118;
        numbers[18] = 119;
        numbers[19] = 120;

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(70, result, 0.0001);
    }
}