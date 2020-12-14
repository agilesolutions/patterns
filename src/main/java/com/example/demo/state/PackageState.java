package com.example.demo.state;

public interface PackageState {

    void next(Package pkg);

    void prev(Package pkg);

    void printStatus();
}