package com.example.designpatterns.state;

public class Hibernated implements VirtualMachineState {
    @Override
    public void terminate(VirtualMachine virtualMachine) {
        virtualMachine.setState(new Terminated());
    }

    @Override
    public void stop(VirtualMachine virtualMachine) {
        System.out.println("Unable to stop hibernated VM");
    }

    @Override
    public void start(VirtualMachine virtualMachine) {
        virtualMachine.setState(new Started());
    }

    @Override
    public void hibernate(VirtualMachine virtualMachine) {
        System.out.println("Already hibernated");
    }

    @Override
    public void setMemory(VirtualMachine virtualMachine, int address, byte value) {
        System.out.println("Unable to set memory");
    }

    @Override
    public void setHardDrive(VirtualMachine virtualMachine, int offset, byte value) {
        System.out.println("Unable to set hard drive");
    }
}
