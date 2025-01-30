package hw3_polymorphism.Shapes;

public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double area = side * side;
        System.out.println("Area of the square: " + area);
        return area;
    }
}
