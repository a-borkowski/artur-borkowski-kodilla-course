package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BoardTestSuite {
    @Autowired
    private Board board;
    @Autowired
    private TaskList toDoList;

    @Test
    public void testBoard(){
        //When
        board.getToDoList().getTasks().add("Test");

        //Then
        Assert.assertEquals("Test", toDoList.getTasks().get(0));
    }
}
