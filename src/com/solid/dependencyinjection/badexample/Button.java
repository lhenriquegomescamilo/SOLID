package com.solid.dependencyinjection.badexample;

public class Button {

    private Lamp lamp;

    /**
     * Essa é uma má pratica, porque de acordo com o princípio uma especificação deve depender
     * apenas de abstrações, caso nesse exemplo um outro dispositivo apareça, seria necessário realiz
     * outra implementação de button
     */
    public void turnOn(){
        boolean someCondition = true;
        if(someCondition){
            lamp.on();
        }
    }
}
