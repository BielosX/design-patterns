package com.example.designpatterns.adapter;

import lombok.Getter;

public class Owen implements KnobController {
    private final static int MAX_TEMPERATURE = 220;
    @Getter
    private int temperature;

    public Owen() {
        this.temperature = 0;
    }

    @Override
    public void left(int value) {
        this.temperature = Math.abs(temperature - value);
    }

    @Override
    public void right(int value) {
        if (this.temperature + value > MAX_TEMPERATURE) {
            this.temperature = MAX_TEMPERATURE;
        } else {
            this.temperature += value;
        }
    }
}
