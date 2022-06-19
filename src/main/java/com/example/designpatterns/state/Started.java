package com.example.designpatterns.state;

import java.util.Iterator;
import java.util.ListIterator;

public class Started implements VirtualMachineState {
    @Override
    public void terminate(VirtualMachine virtualMachine) {
        virtualMachine.setState(new Terminated());
    }

    @Override
    public void stop(VirtualMachine virtualMachine) {
        for(ListIterator<Byte> iterator = virtualMachine.getMemory().listIterator(); iterator.hasNext();) {
            iterator.next();
            iterator.set((byte) 0);
        }
        virtualMachine.setState(new Stopped());
    }

    @Override
    public void start(VirtualMachine virtualMachine) {
        System.out.println("Machine already started");
    }

    @Override
    public void hibernate(VirtualMachine virtualMachine) {
        virtualMachine.setState(new Hibernated());
    }

    @Override
    public void setMemory(VirtualMachine virtualMachine, int address, byte value) {
        virtualMachine.getMemory().set(address, value);
    }

    @Override
    public void setHardDrive(VirtualMachine virtualMachine, int offset, byte value) {
        virtualMachine.getHardDrive().set(offset, value);
    }
}
