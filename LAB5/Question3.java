import java.util.Scanner;

abstract class Shape {
    abstract void calcArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}

public class Question3 {
    public static void main(String[] args) {
        Shape shape;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        shape = new Circle(radius);
        shape.calcArea();
        scanner.close();
    }
}