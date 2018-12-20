package test;

import main.*;

public class SquareTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Square(3);
        shapes[2] = new Rectangle(2, 4);
        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }
            System.out.println(shape.toString());

        }


    }
}
