package com.example.designpatterns.chainofresponsibility;

public class FileMessageSender extends MessageSender {
    @Override
    public void sendMessage(Message message) {
        if (message.getDestination() == Destination.FILE) {
            System.out.println("Message " + message + " saved to file");
        }
        if (this.next != null) {
            this.next.sendMessage(message);
        }
    }
}
