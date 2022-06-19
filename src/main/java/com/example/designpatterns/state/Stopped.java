package com.example.designpatterns.state;

public class Stopped implements VirtualMachineState {
    @Override
    public void terminate(VirtualMachine virtualMachine) {
        virtualMachine.setState(new Terminated());
    }

    @Override
    public void stop(VirtualMachine virtualMachine) {
        System.out.println("VM already stopped");
    }

    @Override
    public void start(VirtualMachine virtualMachine) {
        virtualMachine.setState(new Started());
    }

    @Override
    public void hibernate(VirtualMachine virtualMachine) {
        System.out.println("Unable to Hibernate stopped machine");
    }

    @Override
    public void memoryDump(VirtualMachine virtualMachine) {
        System.out.println("Unable to dump memory in Stopped stated");
    }

    @Override
    public void setMemory(VirtualMachine virtualMachine, int address, byte value) {
        System.out.println("Unable to set memory in Stopped stated");
    }

    @Override
    public void setHardDrive(VirtualMachine virtualMachine, int offset, byte value) {
        System.out.println("Unable to set hard drive in Stopped stated");
    }
}
