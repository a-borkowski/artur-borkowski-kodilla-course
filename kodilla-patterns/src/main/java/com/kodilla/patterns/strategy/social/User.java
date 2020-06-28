package com.kodilla.patterns.strategy.social;

public class User {
    private String userName;
    protected SocialPublisher publisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String sharePost() {
        return publisher.share();
    }

    public void setPublisher(SocialPublisher publisher) {
        this.publisher = publisher;
    }
}
