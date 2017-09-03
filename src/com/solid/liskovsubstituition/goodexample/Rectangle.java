package com.solid.liskovsubstituition.goodexample;

public class Rectangle implements Shape {

    private Double length;
    private Double width;

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public Double calculateArea() {
        return length * width;
    }


}
