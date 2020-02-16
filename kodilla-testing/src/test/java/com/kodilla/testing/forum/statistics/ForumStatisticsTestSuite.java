package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void afterEveryTest() {
        System.out.println("The test #" + testCounter + " end");
    }

    @Test
    public void testCalculateAdvStatisticsZeroPosts() {

        //Given
        StatisticsForum statisticsForum = new StatisticsForum();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        users.add("user3");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        statisticsForum.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(3, statisticsForum.getUserCount());
        Assert.assertEquals(0, statisticsForum.getPostCount());
        Assert.assertEquals(0, statisticsForum.getCommentCount());
    }

    @Test
    public void testCalculateAdvStatisticsThousandPosts() {

        //Given
        StatisticsForum statisticsForum = new StatisticsForum();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        users.add("user3");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        statisticsForum.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(3, statisticsForum.getUserCount());
        Assert.assertEquals(1000, statisticsForum.getPostCount());
        Assert.assertEquals(0, statisticsForum.getCommentCount());
    }
}