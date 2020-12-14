package com.example.demo.state;

import com.example.demo.model.Package;
public interface PackageState {

    void next(Package pkg);

    void prev(Package pkg);

    void printStatus();
}