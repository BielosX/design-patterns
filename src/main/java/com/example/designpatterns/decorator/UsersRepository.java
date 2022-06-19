package com.example.designpatterns.decorator;

import java.util.Optional;

public interface UsersRepository {
    UserView save(User user);
    Optional<UserView> getById(int id);
}
