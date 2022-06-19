package com.example.designpatterns.strategy;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TakeNewest implements FilteringStrategy {
    @Override
    public List<Message> filter(List<Message> messages) {
        return messages.stream()
                .sorted(Comparator.comparing(Message::getCreated).reversed())
                .limit(1)
                .collect(Collectors.toList());
    }
}
