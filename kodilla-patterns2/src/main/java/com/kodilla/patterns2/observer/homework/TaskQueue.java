package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable{
    private List<String> tasks = new ArrayList<>();
    private String name;
    private List<Observer> observers = new ArrayList<>();

    public TaskQueue(String name) {
        this.name = name;
    }

    public void addTask (String task){
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(this) );
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
