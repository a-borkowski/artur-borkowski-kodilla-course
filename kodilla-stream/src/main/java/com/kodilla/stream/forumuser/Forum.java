package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum () {
        forumUsers.add(new ForumUser(001, "User1", 'F',2001,01,01,1 ));
        forumUsers.add(new ForumUser(002, "User2", 'M',2002,02,02,2 ));
        forumUsers.add(new ForumUser(003, "User3", 'F',2003,03,03,3 ));
        forumUsers.add(new ForumUser(004, "User4", 'M',1990,04,04,4 ));
        forumUsers.add(new ForumUser(005, "User5", 'F',2005,05,05,5 ));
        forumUsers.add(new ForumUser(006, "User6", 'M',2006,06,06,1 ));
        forumUsers.add(new ForumUser(007, "User7", 'F',2007,07,07,7 ));
    }

    public List<ForumUser> getForumList() {
        return new ArrayList<>(forumUsers);
    }
}
