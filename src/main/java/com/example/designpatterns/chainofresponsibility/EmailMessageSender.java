package com.example.designpatterns.chainofresponsibility;

public class EmailMessageSender extends MessageSender {
    @Override
    public void sendMessage(Message message) {
        if (message.getDestination() == Destination.EMAIL) {
            System.out.println("Message " + message + " sent by Email");
        }
        if (this.getNext() != null) {
            this.getNext().sendMessage(message);
        }
    }
}
