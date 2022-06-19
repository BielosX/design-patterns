package com.example.designpatterns.composite;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Boss implements Drawable {
    private final Point point;

    @Override
    public void draw() {
        System.out.println("Boss at: " + point);
    }
}
