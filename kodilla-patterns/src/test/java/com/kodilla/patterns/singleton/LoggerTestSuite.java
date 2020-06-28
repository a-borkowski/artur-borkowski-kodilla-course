package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testLogger(){
        //Given
        Logger logger = Logger.getInstance();

        //When
        logger.log("Logowanie");

        //Then
        Assert.assertEquals("Logowanie", logger.getLastLog());
    }
}
