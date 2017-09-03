package com.solid.liskovsubstituition.goodexample;

public class Circle implements Shape {

    private Double radius;


    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}
