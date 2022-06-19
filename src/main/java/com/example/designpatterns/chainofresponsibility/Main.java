package com.example.designpatterns.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        MessageSender sender = new EmailMessageSender();
        sender.setNext(new FileMessageSender());
        sender.setNext(new QueueMessageSender());

        sender.sendMessage(new Message("Hello", Destination.EMAIL));
        sender.sendMessage(new Message("Arigato", Destination.FILE));
        sender.sendMessage(new Message("Ave", Destination.QUEUE));
    }
}
