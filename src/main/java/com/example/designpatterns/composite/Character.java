package com.example.designpatterns.composite;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Character implements Drawable {
    private final Point position;

    @Override
    public void draw() {
        System.out.println("Character at: " + position);
    }
}
