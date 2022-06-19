package com.example.designpatterns.decorator;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

public class InMemoryUsersRepository implements UsersRepository {
    private final Map<Integer, User> users;
    private final Random random;

    public InMemoryUsersRepository() {
        users = new HashMap<>();
        random = new Random();
    }

    @Override
    public UserView save(User user) {
        int id = random.nextInt();
        users.put(id, user);
        return new UserView(id, user.getName(), user.getAddress());
    }

    @Override
    public Optional<UserView> getById(int id) {
        return Optional.ofNullable(users.get(id)).map(user -> new UserView(id, user.getName(), user.getAddress()));
    }
}
