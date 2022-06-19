package com.example.designpatterns.observer;

import java.util.*;

public class InMemoryUsersRepository {
    private final Map<Integer, User> users;
    private final Random random;
    private final List<UserRemovedObserver> observers;

    public InMemoryUsersRepository() {
        users = new HashMap<>();
        random = new Random();
        observers = new ArrayList<>();
    }

    public UserView save(User user) {
        int id = random.nextInt();
        users.put(id, user);
        return new UserView(id, user.getName(), user.getAge());
    }

    public Optional<UserView> getById(int id) {
        return Optional.ofNullable(users.get(id)).map(user -> new UserView(id, user.getName(), user.getAge()));
    }

    public void remove(int id) {
        if (users.containsKey(id)) {
            User user = users.get(id);
            UserView view = new UserView(id, user.getName(), user.getAge());
            users.remove(id);
            observers.forEach(observer -> observer.notify(view));
        }
    }

    public void registerObserver(UserRemovedObserver observer) {
        observers.add(observer);
    }
}
