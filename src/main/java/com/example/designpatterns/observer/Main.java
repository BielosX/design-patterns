package com.example.designpatterns.observer;

public class Main {
    public static void main(String[] args) {
        InMemoryBooksRepository booksRepository = new InMemoryBooksRepository();
        InMemoryUsersRepository usersRepository = new InMemoryUsersRepository();
        LoggingObserver loggingObserver = new LoggingObserver();
        usersRepository.registerObserver(loggingObserver);
        usersRepository.registerObserver(booksRepository);

        UserView user = usersRepository.save(new User("Tomasz", 15));
        booksRepository.save(new Book("LOTR", "Tolkien", user.getId()));
        booksRepository.save(new Book("Hobbit", "Tolkien", user.getId()));
        System.out.println(booksRepository.getAllByOwnerId(user.getId()));
        UserView secondUser = usersRepository.save(new User("Janusz", 70));
        booksRepository.save(new Book("Pan Tadeusz", "Mickiewicz", secondUser.getId()));

        usersRepository.remove(user.getId());

        System.out.println(booksRepository.getAllByOwnerId(user.getId()));
        System.out.println(booksRepository.getAllByOwnerId(secondUser.getId()));
    }
}
