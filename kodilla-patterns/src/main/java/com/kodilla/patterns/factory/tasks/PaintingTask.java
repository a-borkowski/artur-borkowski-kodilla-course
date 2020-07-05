package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Do painting");
    }

    @Override
    public String getTaskName() {
        return "Painting task";
    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }
}
