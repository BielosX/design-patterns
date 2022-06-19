package com.example.designpatterns.chainofresponsibility;

import lombok.Getter;

public abstract class MessageSender {
    protected MessageSender next;

    public void setNext(MessageSender next) {
        if (this.next == null) {
            this.next = next;
        } else {
            this.next.setNext(next);
        }
    }

    public abstract void sendMessage(Message message);
}
