package hw3_polymorphism.Shapes;

public class Triangle implements Shape {

    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        double area = 0.5 * height * base;
        System.out.println("Triangle Area: " + area);
        return area;
    }
}
