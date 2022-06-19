package com.example.designpatterns.composite;

public class Main {
    public static void main(String[] args) {
        Scene scene = new Scene();
        scene.add(new Boss(new Point(0.0f, 0.0f, 0.0f)));
        scene.add(new Character(new Point(1.0f, 1.0f, 1.0f)));
        scene.add(new Character(new Point(2.0f, 3.0f, 4.0f)));
        scene.draw();
    }
}
