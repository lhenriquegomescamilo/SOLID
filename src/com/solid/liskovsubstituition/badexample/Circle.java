package com.solid.liskovsubstituition.badexample;

public class Circle {

    private Double radius;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double calculateArea(){
        return this.radius * this.radius * Math.PI;
    }
}
