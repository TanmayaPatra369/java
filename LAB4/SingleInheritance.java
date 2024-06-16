import java.util.Scanner;

abstract class Shape {
    protected double dimensions[];

    public Shape(double... dimensions) {
        this.dimensions = dimensions;
    }

    public abstract double calculateCost();
}

class Sheet extends Shape {

    public Sheet(double width, double height) {
        super(width, height);
    }

    @Override
    public double calculateCost() {
        return dimensions[0] * dimensions[1] * 40.0;
    }
}

class Box extends Shape {

    public Box(double width, double height, double depth) {
        super(width, height, depth);
    }

    @Override
    public double calculateCost() {
        return dimensions[0] * dimensions[1] * dimensions[2] * 60.0;
    }
}
public class SingleInheritance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double dimensions[];

        do {
            System.out.println("\n1. Calculate cost of sheet");
            System.out.println("2. Calculate cost of box");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter width and height of sheet (in ft.): ");
                    dimensions = new double[2];
                    dimensions[0] = scanner.nextDouble();
                    dimensions[1] = scanner.nextDouble();
                    Sheet sheet = new Sheet(dimensions[0], dimensions[1]);
                    System.out.printf("Cost of sheet: Rs. %.2f\n", sheet.calculateCost());
                    break;
                case 2:
                    System.out.print("Enter width, height, and depth of box (in ft.): ");
                    dimensions = new double[3];
                    dimensions[0] = scanner.nextDouble();
                    dimensions[1] = scanner.nextDouble();
                    dimensions[2] = scanner.nextDouble();
                    Box box = new Box(dimensions[0], dimensions[1], dimensions[2]);
                    System.out.printf("Cost of box: Rs. %.2f\n", box.calculateCost());
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}