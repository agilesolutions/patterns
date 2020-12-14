package com.example.demo.model;

import com.example.demo.state.OrderedState;
import com.example.demo.state.PackageState;

public class Package {

    private PackageState state = new OrderedState();

    public PackageState getState() {
        return state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}