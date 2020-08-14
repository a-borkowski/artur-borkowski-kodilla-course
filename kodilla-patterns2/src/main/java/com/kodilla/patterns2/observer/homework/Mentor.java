package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(taskQueue.getTasks().size());
    }
}
