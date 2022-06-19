package com.example.designpatterns.adapter;

public class OnOffSwitchToKnobAdapter implements KnobController {
    private final static int MAX_VALUE = 200;
    private final static int SWITCH_POINT = 100;
    private final OnOffSwitch onOffSwitch;
    private int value;

    public OnOffSwitchToKnobAdapter(OnOffSwitch onOffSwitch) {
        this.onOffSwitch = onOffSwitch;
        this.onOffSwitch.switchOff();
        this.value = 0;
    }

    @Override
    public void left(int value) {
        this.value = Math.abs(this.value - value);
        if (this.value < SWITCH_POINT) {
            onOffSwitch.switchOff();
        }
    }

    @Override
    public void right(int value) {
        if (this.value + value > MAX_VALUE) {
            this.value = MAX_VALUE;
        } else {
            this.value += value;
        }
        if (this.value >= SWITCH_POINT) {
            onOffSwitch.switchOn();
        }
    }
}
