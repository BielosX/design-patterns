package com.example.designpatterns.command;

public class FanOn implements Command {
    @Override
    public void execute() {
        System.out.println("Fan switched ON");
    }
}
