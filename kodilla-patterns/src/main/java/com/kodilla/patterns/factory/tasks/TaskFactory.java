package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING_TASK = "Driving Task";
    public static final String PAINTING_TASK = "Painting Task";
    public static final String SHOPPING_TASK = "Shopping Task";

    public static Task createTask(String taskName){
        switch (taskName){
            case DRIVING_TASK: return new DrivingTask("na zakupy", "Katowice", "Taxi");
            case PAINTING_TASK: return new PaintingTask("malowania pokoju", "biały", "salon");
            case SHOPPING_TASK: return new ShoppingTask("śniadanie", "chleb", 1);
            default:return null;
        }
    }
}
