package com.example.designpatterns.observer;

import lombok.Value;

@Value
public class BookView {
    int bookId;
    String title;
    String author;
    int ownerId;
}
