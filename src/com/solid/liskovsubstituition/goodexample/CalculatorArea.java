package com.solid.liskovsubstituition.goodexample;

public class CalculatorArea {

    public Double calculate(Shape shape) {
        return shape.calculateArea();
    }
}
