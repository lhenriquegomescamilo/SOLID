package com.solid.openclosed.badexample;

public class CalculatorArea {
    public Double calulatorRectangle(Rectangle rectangle) {
        return rectangle.getLength() * rectangle.getWidth();
    }

    public Double calculateCircle(Circle circle) {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }

}
