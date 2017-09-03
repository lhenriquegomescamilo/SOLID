package com.solid.dependencyinjection.goodexample;

public class Button {

    private Device device;


    public void turnOnOorOff() {
        boolean someCondition = true;
        if (someCondition) {
            device.on();
        } else {
            device.off();
        }
    }
}
