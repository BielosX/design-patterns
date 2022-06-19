package com.example.designpatterns.command;

public class FanOff implements Command {
    @Override
    public void execute() {
        System.out.println("Fan switched OFF");
    }
}
