package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

public class TaskQueueTestSuite {
    @Test
    public void testNotify(){
        TaskQueue tq1 = new TaskQueue("Jan Kowalski");
        TaskQueue tq2 = new TaskQueue("Piotr Nowak");
        Mentor mn1 = new Mentor();
        Mentor mn2 = new Mentor();

        tq1.registerObserver(mn1);
        tq2.registerObserver(mn1);
        tq2.registerObserver(mn2);

        tq1.addTask("Zadanie 1");
        tq2.addTask("Zadanie 2");
        tq2.addTask("Zadanie 3");
    }
}