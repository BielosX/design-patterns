package com.example.designpatterns.decorator;

import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class LoggingUsersRepository implements UsersRepository {
    private final UsersRepository repository;

    @Override
    public UserView save(User user) {
        UserView saved = repository.save(user);
        System.out.printf("Saved user: {id: %d, name: %s, address: %s}%n",
                saved.getId(), saved.getName(), saved.getAddress());
        return saved;
    }

    @Override
    public Optional<UserView> getById(int id) {
        Optional<UserView> result = repository.getById(id);
        result.ifPresentOrElse(user -> {
            System.out.printf("Fetched user: {id: %d, name: %s, address: %s}%n",
                    user.getId(), user.getName(), user.getAddress());
        }, () -> System.out.println("Unable to find user with id: " + id));
        return result;
    }
}
