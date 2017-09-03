package com.solid.dependencyinjection.goodexample;

public class Lamp implements Device {
    @Override
    public boolean on() {
        return false;
    }

    @Override
    public boolean off() {
        return false;
    }
}
