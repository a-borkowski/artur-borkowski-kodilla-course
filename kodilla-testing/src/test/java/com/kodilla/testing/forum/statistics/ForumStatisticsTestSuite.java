package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
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
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        statisticsForum.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(3, statisticsForum.getUserCount());
        assertEquals(0, statisticsForum.getPostCount());
        assertEquals(100, statisticsForum.getCommentCount());
        assertEquals(0, statisticsForum.getPostsPerUser(), 0.0001);
        assertEquals(0, statisticsForum.getCommentsPerPosts(), 0.0001);
        assertEquals(33.3333, statisticsForum.getCommentsPerUser(), 0.0001);
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
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        statisticsForum.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(3, statisticsForum.getUserCount());
        assertEquals(1000, statisticsForum.getPostCount());
        assertEquals(100, statisticsForum.getCommentCount());
        assertEquals(333.3333, statisticsForum.getPostsPerUser(), 0.0001);
        assertEquals(0.1, statisticsForum.getCommentsPerPosts(), 0.0001);
        assertEquals(33.3333, statisticsForum.getCommentsPerUser(), 0.0001);
    }

    @Test
    public void testCalculateAdvStatisticsZeroComments() {
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
        assertEquals(3, statisticsForum.getUserCount());
        assertEquals(1000, statisticsForum.getPostCount());
        assertEquals(0, statisticsForum.getCommentCount());
        assertEquals(333.3333, statisticsForum.getPostsPerUser(), 0.0001);
        assertEquals(0, statisticsForum.getCommentsPerPosts(),0.0001);
        assertEquals(0, statisticsForum.getCommentsPerUser(), 0.0001);
    }

    @Test
    public void testCalculateAdvStatisticsLessCommentsThanPosts() {
        //Given
        StatisticsForum statisticsForum = new StatisticsForum();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        users.add("user3");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        statisticsForum.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(3, statisticsForum.getUserCount());
        assertEquals(1000, statisticsForum.getPostCount());
        assertEquals(100, statisticsForum.getCommentCount());
        assertEquals(333.3333, statisticsForum.getPostsPerUser(), 0.0001);
        assertEquals(0.1, statisticsForum.getCommentsPerPosts(),0.0001);
        assertEquals(33.3333, statisticsForum.getCommentsPerUser(), 0.0001);
    }

    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts() {
        //Given
        StatisticsForum statisticsForum = new StatisticsForum();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        users.add("user3");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        statisticsForum.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(3, statisticsForum.getUserCount());
        assertEquals(100, statisticsForum.getPostCount());
        assertEquals(1000, statisticsForum.getCommentCount());
        assertEquals(33.3333, statisticsForum.getPostsPerUser(), 0.0001);
        assertEquals(10, statisticsForum.getCommentsPerPosts(),0.0001);
        assertEquals(333.3333, statisticsForum.getCommentsPerUser(), 0.0001);
    }

    @Test
    public void testCalculateAdvStatisticsZeroUsers() {
        //Given
        StatisticsForum statisticsForum = new StatisticsForum();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        //users.add("user1");
        //users.add("user2");
        //users.add("user3");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        statisticsForum.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, statisticsForum.getUserCount());
        assertEquals(100, statisticsForum.getPostCount());
        assertEquals(1000, statisticsForum.getCommentCount());
        assertEquals(0, statisticsForum.getPostsPerUser(), 0.0001);
        assertEquals(10, statisticsForum.getCommentsPerPosts(),0.0001);
        assertEquals(0, statisticsForum.getCommentsPerUser(), 0.0001);
    }

    @Test
    public void testCalculateAdvStatisticsOneHundredUsers() {
        //Given
        StatisticsForum statisticsForum = new StatisticsForum();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        for (int i=0; i < 100; i++) {
            users.add("user" + i+1);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        statisticsForum.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, statisticsForum.getUserCount());
        assertEquals(100, statisticsForum.getPostCount());
        assertEquals(1000, statisticsForum.getCommentCount());
        assertEquals(1, statisticsForum.getPostsPerUser(), 0.0001);
        assertEquals(10, statisticsForum.getCommentsPerPosts(),0.0001);
        assertEquals(10, statisticsForum.getCommentsPerUser(), 0.0001);
    }
}