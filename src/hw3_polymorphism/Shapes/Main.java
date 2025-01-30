package hw3_polymorphism.Shapes;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(2.5);
        Square square = new Square(5);
        Triangle triangle = new Triangle(10, 12.3);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(square);
        shapes.add(triangle);

        calculateTotalAreaList(shapes);

        Shape[] shapesArray = new Shape[]{circle, square, triangle};
        calculateTotalAreaArray(shapesArray);

    }

    public static void calculateTotalAreaList(ArrayList<Shape> shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        System.out.println("Total Area: " + totalArea + "\n");
    }

    public static void calculateTotalAreaArray(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        System.out.println("Total Area: " + totalArea + "\n");
    }
}
