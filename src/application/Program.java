package application;

import model.entities.*;
import model.enums.ShapeColors;

public class Program {

    public static void main(String[] args) {

        Shape s1 = new Circle(2.0);
        Shape s2 = new Rectangle(3.0, 4.0);
        AbstractShape s3 = new Square(ShapeColors.BLACK, 5.0); // With color

        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
        System.out.println();
        System.out.println("Square color: " + s3.getShapeColors());
        System.out.println("Square area: " + String.format("%.3f", s3.area()));
    }
}
