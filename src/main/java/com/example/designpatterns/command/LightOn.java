package com.example.designpatterns.command;

public class LightOn implements Command {
    @Override
    public void execute() {
        System.out.println("Light switched ON");
    }
}
