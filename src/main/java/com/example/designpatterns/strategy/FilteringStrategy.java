package com.example.designpatterns.strategy;

import java.util.List;

public interface FilteringStrategy {
    List<Message> filter(List<Message> messages);
}
