package com.example.designpatterns.command;

public class LightOff implements Command {
    @Override
    public void execute() {
        System.out.println("Light switched OFF");
    }
}
