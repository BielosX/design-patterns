package com.example.designpatterns.strategy;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Message> messages = List.of(
                new Message("Hello", LocalDateTime.of(2022, 6, 19, 10, 50)),
                new Message("Ave", LocalDateTime.of(2022, 6, 18, 10, 50)),
                new Message("Arigato", LocalDateTime.of(2022, 6, 17, 10, 50)));
        FilteringStrategy keepTwoNewest = new KeepSomeNewest(2);
        MessageProcessor processor = new MessageProcessor(keepTwoNewest);
        System.out.println("With KeepTwoNewest");
        processor.process(messages);
        FilteringStrategy takeNewest = new TakeNewest();
        processor.setFilteringStrategy(takeNewest);
        System.out.println("With TakeNewest");
        processor.process(messages);
    }
}
