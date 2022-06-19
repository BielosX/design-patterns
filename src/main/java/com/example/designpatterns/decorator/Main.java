package com.example.designpatterns.decorator;

public class Main {
    public static void main(String[] args) {
        UsersRepository repository = new LoggingUsersRepository(new InMemoryUsersRepository());
        UserView view = repository.save(new User("Tomasz", "Grunwaldzka 15"));
        repository.getById(150);
        repository.getById(view.getId());
    }
}
