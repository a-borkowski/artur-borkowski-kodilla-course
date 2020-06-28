package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User user1 = new Millenials("UM");
        User user2 = new YGeneration("UY");
        User user3 = new ZGeneration("UZ");

        //When
        String s1 = user1.sharePost();
        String s2 = user2.sharePost();
        String s3 = user3.sharePost();

        //Then
        Assert.assertEquals("Facebook", s1);
        Assert.assertEquals("Twitter", s2);
        Assert.assertEquals("Snapchat", s3);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User user1 = new Millenials("UM");
        user1.setPublisher(new TwitterPublisher());

        //When
        String s1 = user1.sharePost();

        //Then
        Assert.assertEquals("Twitter", s1);
    }
}
