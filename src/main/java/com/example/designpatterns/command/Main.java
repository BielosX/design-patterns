package com.example.designpatterns.command;

public class Main {
    public static void main(String[] args) {
        ProgrammableKeyboard keyboard = new ProgrammableKeyboard(4);
        keyboard.assignToOnButton(0, new LightOn());
        keyboard.assignToOnButton(1, new FanOn());
        keyboard.assignToOffButton(0, new LightOff());
        keyboard.assignToOffButton(1, new FanOff());

        keyboard.pressOnButton(0);
        keyboard.pressOnButton(1);

        keyboard.pressOffButton(0);
        keyboard.pressOffButton(1);
    }
}
