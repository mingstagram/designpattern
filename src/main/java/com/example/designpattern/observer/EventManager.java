package com.example.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private final List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void notifyAll(String postTitle) {
        for (Observer o : observers) {
            o.handle(postTitle);
        }
    }

}
