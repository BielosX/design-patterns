package com.example.designpatterns.adapter;

import lombok.Getter;

public class Fan implements OnOffSwitch {
    @Getter
    private boolean working;

    public Fan() {
        this.working = false;
    }

    @Override
    public void switchOn() {
        this.working = true;
    }

    @Override
    public void switchOff() {
        this.working = false;
    }
}
