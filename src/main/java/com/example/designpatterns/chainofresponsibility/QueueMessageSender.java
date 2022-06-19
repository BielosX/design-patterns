package com.example.designpatterns.chainofresponsibility;

public class QueueMessageSender extends MessageSender {
    @Override
    public void sendMessage(Message message) {
        if (message.getDestination() == Destination.QUEUE) {
            System.out.println("Message " + message + " sent to Queue");
        }
        if (this.next != null) {
            this.next.sendMessage(message);
        }
    }
}
