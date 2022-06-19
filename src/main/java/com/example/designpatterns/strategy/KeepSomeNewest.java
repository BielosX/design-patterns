package com.example.designpatterns.strategy;

import lombok.RequiredArgsConstructor;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class KeepSomeNewest implements FilteringStrategy {
    private final int count;
    @Override
    public List<Message> filter(List<Message> messages) {
        return messages.stream()
                .sorted(Comparator.comparing(Message::getCreated).reversed())
                .limit(count)
                .collect(Collectors.toList());
    }
}
