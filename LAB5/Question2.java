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

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void calcArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of triangle: " + area);
    }
}

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        circle.calcArea();

        System.out.print("Enter base and height of triangle (space-separated): ");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        Triangle triangle = new Triangle(base, height);
        triangle.calcArea();

        scanner.close();
    }
}