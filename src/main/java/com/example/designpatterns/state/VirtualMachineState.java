package com.example.designpatterns.state;

import java.util.Iterator;

public interface VirtualMachineState {
    void terminate(VirtualMachine virtualMachine);
    void stop(VirtualMachine virtualMachine);
    void start(VirtualMachine virtualMachine);
    void hibernate(VirtualMachine virtualMachine);
    default void memoryDump(VirtualMachine virtualMachine) {
        System.out.println("Memory dump: ");
        StringBuilder builder = new StringBuilder();
        for (Iterator<Byte> iterator = virtualMachine.getMemory().iterator(); iterator.hasNext();) {
            Byte value = iterator.next();
            builder.append(String.format("0x%02X ", value));
        }
        System.out.println(builder);
    }
    default void hardDriveDump(VirtualMachine virtualMachine) {
        System.out.println("HDD dump: ");
        StringBuilder builder = new StringBuilder();
        for (Iterator<Byte> iterator = virtualMachine.getHardDrive().iterator(); iterator.hasNext();) {
            Byte value = iterator.next();
            builder.append(String.format("0x%02X ", value));
        }
        System.out.println(builder);
    }
    void setMemory(VirtualMachine virtualMachine, int address, byte value);
    void setHardDrive(VirtualMachine virtualMachine, int offset, byte value);
}
