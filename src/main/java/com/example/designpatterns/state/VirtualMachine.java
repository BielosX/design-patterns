package com.example.designpatterns.state;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class VirtualMachine {
    @Getter
    private final List<Byte> memory;

    @Getter
    private final List<Byte> hardDrive;
    @Setter
    private VirtualMachineState state;

    public VirtualMachine(int memorySize, int hardDriveSize) {
        this.memory = new ArrayList<>(memorySize);
        this.hardDrive = new ArrayList<>(hardDriveSize);
        this.state = new Started();
        for (int x = 0; x < memorySize; x++) {
            this.memory.add((byte) 0);
        }
        for (int x = 0; x < hardDriveSize; x++) {
            this.hardDrive.add((byte) 0);
        }
    }

    public void start() {
        state.start(this);
    }

    public void stop() {
        state.stop(this);
    }

    public void hibernate() {
        state.hibernate(this);
    }

    public void terminate() {
        state.terminate(this);
    }

    public void setMemory(int address, byte value) {
        state.setMemory(this, address, value);
    }

    public void setHardDrive(int offset, byte value) {
        state.setHardDrive(this, offset, value);
    }

    public void dumpMemory() {
        state.memoryDump(this);
    }

    public void dumpHardDrive() {
        state.hardDriveDump(this);
    }
}
