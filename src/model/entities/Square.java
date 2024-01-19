package model.entities;

import model.enums.ShapeColors;

import java.awt.*;

public class Square extends AbstractShape{

    private Double length;

    public Square(ShapeColors shapeColors, Double length) {
        super(shapeColors);
        this.length = length;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return Math.pow(length, 2);
    }
}
