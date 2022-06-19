package com.example.designpatterns.state;

public class Terminated implements VirtualMachineState {
    @Override
    public void terminate(VirtualMachine virtualMachine) {
        System.out.println("VM already terminated");
    }

    @Override
    public void stop(VirtualMachine virtualMachine) {
        System.out.println("Unable to stop terminated VM");
    }

    @Override
    public void start(VirtualMachine virtualMachine) {
        System.out.println("Unable to start terminated VM");
    }

    @Override
    public void hibernate(VirtualMachine virtualMachine) {
        System.out.println("Unable to hibernate terminated VM");
    }

    @Override
    public void memoryDump(VirtualMachine virtualMachine) {
        System.out.println("Unable to dump memory of terminated VM");
    }

    @Override
    public void hardDriveDump(VirtualMachine virtualMachine) {
        System.out.println("Unable to dump hard drive of terminated VM");
    }

    @Override
    public void setMemory(VirtualMachine virtualMachine, int address, byte value) {
        System.out.println("Unable to set memory of terminated VM");
    }

    @Override
    public void setHardDrive(VirtualMachine virtualMachine, int offset, byte value) {
        System.out.println("Unable to set hard drive of terminated VM");
    }
}
