package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testCreateTask(){

        //When
        Task task = TaskFactory.createTask(TaskFactory.SHOPPING_TASK);

        //Then
        Assert.assertEquals("Shopping task", task.getTaskName());
    }
}