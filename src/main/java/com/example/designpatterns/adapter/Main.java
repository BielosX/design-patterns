package com.example.designpatterns.adapter;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Owen owen = new Owen();
        fan.switchOn();
        owen.right(50);
        System.out.println("Fan state: " + fan.isWorking());
        System.out.println("Owen temperature: " + owen.getTemperature());
        fan.switchOff();

        KnobController knobController = new OnOffSwitchToKnobAdapter(fan);
        knobController.right(150);
        System.out.println("Fan state: " + fan.isWorking());
        knobController.left(80);
        System.out.println("Fan state: " + fan.isWorking());
    }
}
