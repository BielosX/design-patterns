package com.example.designpatterns.chainofresponsibility;

public class EmailMessageSender extends MessageSender {
    @Override
    public void sendMessage(Message message) {
        if (message.getDestination() == Destination.EMAIL) {
            System.out.println("Message " + message + " sent by Email");
        }
        if (this.next != null) {
            this.next.sendMessage(message);
        }
    }
}
