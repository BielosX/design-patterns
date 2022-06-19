package com.example.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class ProgrammableKeyboard {
    private final List<Command> onButtons;
    private final List<Command> offButtons;
    private final int buttons;

    public ProgrammableKeyboard(int buttons) {
        this.buttons = buttons;
        this.onButtons = new ArrayList<>(buttons);
        this.offButtons = new ArrayList<>(buttons);
        for (int x = 0; x < buttons; x++) {
            this.offButtons.add(null);
            this.onButtons.add(null);
        }
    }

    public void assignToOnButton(int button, Command command) {
        assignToButton(button, this.onButtons, command);
    }

    public void assignToOffButton(int button, Command command) {
        assignToButton(button, this.offButtons, command);
    }

    private void assignToButton(int number, List<Command> buttons, Command command) {
        if (number > this.buttons - 1) {
            throw new IllegalStateException("Button of numer " + number + " does not exist");
        }
        buttons.add(number, command);
    }

    public void pressOnButton(int button) {
        pressButton(button, this.onButtons);
    }

    public void pressOffButton(int button) {
        pressButton(button, this.offButtons);
    }

    private void pressButton(int button, List<Command> buttons) {
        Command command = buttons.get(button);
        if (command == null) {
            System.out.println("No command is assigned to this button");
        } else {
            command.execute();
        }
    }
}
