package com.example.designpatterns.observer;

import java.util.*;
import java.util.stream.Collectors;

public class InMemoryBooksRepository implements UserRemovedObserver {
    private final Map<Integer, Book> books;
    private final Random random;

    public InMemoryBooksRepository() {
        books = new HashMap<>();
        random = new Random();
    }

    public BookView save(Book book) {
        int id = random.nextInt();
        books.put(id, book);
        return new BookView(id, book.getTitle(), book.getAuthor(), book.getOwnerId());
    }

    public List<BookView> getAllByOwnerId(int ownerId) {
        return books.entrySet().stream()
                .filter(entry -> entry.getValue().getOwnerId() == ownerId)
                .map(entry -> {
                    var value = entry.getValue();
                    return new BookView(entry.getKey(), value.getTitle(), value.getAuthor(), value.getOwnerId());
                })
                .collect(Collectors.toList());
    }

    @Override
    public void notify(UserView view) {
        books.entrySet().removeIf(entry -> entry.getValue().getOwnerId() == view.getId());
    }
}
