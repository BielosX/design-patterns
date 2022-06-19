package com.example.designpatterns.observer;

public class LoggingObserver implements UserRemovedObserver {
    @Override
    public void notify(UserView view) {
        System.out.printf("User {id: %d, name: %s, age: %d} removed%n", view.getId(), view.getName(), view.getAge());
    }
}
