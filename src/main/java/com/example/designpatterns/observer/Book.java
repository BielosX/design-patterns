package com.example.designpatterns.observer;

import lombok.Value;

@Value
public class Book {
    String title;
    String author;
    int ownerId;
}
