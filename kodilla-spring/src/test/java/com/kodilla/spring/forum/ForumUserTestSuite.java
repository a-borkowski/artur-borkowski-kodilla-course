package com.kodilla.spring.forum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ForumUserTestSuite {
    @Autowired
    private ForumUser forumUser;
    @Test
    public void testGetUsername() {
        Assert.assertEquals("John Smith", forumUser.getUserName());
    }
}