package model.entities;

import model.enums.ShapeColors;

import java.awt.*;

public abstract class AbstractShape implements Shape{
    private ShapeColors shapeColors;

    public AbstractShape(ShapeColors shapeColors) {
        this.shapeColors = shapeColors;
    }

    public ShapeColors getShapeColors() {
        return shapeColors;
    }

    public void setShapeColors(ShapeColors shapeColors) {
        this.shapeColors = shapeColors;
    }
}
