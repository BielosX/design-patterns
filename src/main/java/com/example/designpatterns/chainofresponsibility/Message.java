package com.example.designpatterns.chainofresponsibility;

import lombok.Value;

@Value
public class Message {
    String content;
    Destination destination;
}
