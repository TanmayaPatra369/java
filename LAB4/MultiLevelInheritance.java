import java.util.Scanner;

class Plate {
    double length;
    double width;

    Plate(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void display() {
        System.out.println("Plate dimensions: " + length + " ft x " + width + " ft");
    }
}

class Box extends Plate {
    double height;

    Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    void display() {
        super.display();
        System.out.println("Box dimensions: " + length + " ft x " + width + " ft x " + height + " ft");
    }
}

class WoodBox extends Box {
    double thick;

    WoodBox(double length, double width, double height, double thick) {
        super(length, width, height);
        this.thick = thick;
    }

    void display() {
        super.display();
        System.out.println("Wood box dimensions: " + length + " ft x " + width + " ft x " + height + " ft, " + thick + " ft thickness");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of plate: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of plate: ");
        double width = scanner.nextDouble();
        Plate plate = new Plate(length, width);
        plate.display();

        System.out.print("Enter length of box: ");
        length = scanner.nextDouble();
        System.out.print("Enter width of box: ");
        width = scanner.nextDouble();
        System.out.print("Enter height of box: ");
        double height = scanner.nextDouble();
        Box box = new Box(length, width, height);
        box.display();

        System.out.print("Enter thickness of wood box: ");
        double thick = scanner.nextDouble();
        WoodBox woodBox = new WoodBox(length, width, height, thick);
        woodBox.display();

        scanner.close();
    }
}