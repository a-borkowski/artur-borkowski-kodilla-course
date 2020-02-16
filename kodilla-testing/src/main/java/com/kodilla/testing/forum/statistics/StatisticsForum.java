package com.kodilla.testing.forum.statistics;

public class StatisticsForum {
    private int userCount;
    private int postCount;
    private int commentCount;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPosts;

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPosts() {
        return commentsPerPosts;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
        postsPerUser = calculatePostsPerUser();
        commentsPerUser = calculateCommentsPerUser();
        commentsPerPosts = calculateCommentsPerPosts();
    }

    private double calculatePostsPerUser(){
        if (userCount > 0) {
            return (double) postCount / userCount;
        } else
            return 0;
    }

    private double calculateCommentsPerUser(){
        if (userCount >0) {
            return (double) commentCount / userCount;
        } else
            return 0;
    }

    private double calculateCommentsPerPosts(){
        if (userCount >0) {
            return (double) commentCount / postCount;
        } else
            return 0;
    }

    public void showStatistics(){
        System.out.println(userCount);
        System.out.println(postCount);
        System.out.println(commentCount);
        System.out.println(postsPerUser);
        System.out.println(commentsPerUser);
        System.out.println(commentsPerPosts);
    }
}