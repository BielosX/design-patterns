package com.example.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Scene implements Drawable {
    private final List<Drawable> drawables;

    public Scene() {
        drawables = new ArrayList<>();
    }

    public void add(Drawable drawable) {
        drawables.add(drawable);
    }

    @Override
    public void draw() {
        drawables.forEach(Drawable::draw);
    }
}
