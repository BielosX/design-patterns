package com.example.designpatterns.strategy;

import lombok.AllArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
public class MessageProcessor {

    @Setter
    private FilteringStrategy filteringStrategy;

    public void process(List<Message> messages) {
        filteringStrategy.filter(messages).forEach(message -> System.out.println(message.getContent()));
    }
}
