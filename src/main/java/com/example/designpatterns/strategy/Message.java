package com.example.designpatterns.strategy;

import lombok.Value;

import java.time.LocalDateTime;

@Value
public class Message {
    String content;
    LocalDateTime created;
}
