package com.example.designpatterns.state;

public class Main {
    public static void main(String[] args) {
        VirtualMachine machine = new VirtualMachine(8, 8);
        machine.setMemory(2, (byte) 0xAB);
        machine.setMemory(4, (byte) 0x12);
        machine.setHardDrive(4, (byte) 0xCC);
        machine.setHardDrive(6, (byte) 0xBF);

        machine.hibernate();
        machine.dumpHardDrive();
        machine.dumpMemory();

        machine.start();

        machine.stop();

        machine.start();
        machine.dumpHardDrive();
        machine.dumpMemory();

        machine.terminate();
        machine.start();
    }
}
