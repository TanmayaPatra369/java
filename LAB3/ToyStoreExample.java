import java.util.Scanner;

public class ToyStoreExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of toys: ");
        int numToys = scanner.nextInt();

        Toy[] toys = new Toy[numToys];
        double grandTotal = 0;

        for (int i = 0; i < numToys; i++) {
            System.out.println("Enter details for toy " + (i + 1) + ":");

            System.out.print("Toy ID: ");
            int toyId = scanner.nextInt();

            scanner.nextLine(); // consume newline character

            System.out.print("Toy Name: ");
            String toyName = scanner.nextLine();

            System.out.print("Toy Quantity: ");
            int toyQty = scanner.nextInt();

            System.out.print("Toy Price: ");
            double toyPrice = scanner.nextDouble();

            toys[i] = new Toy(toyId, toyName, toyQty, toyPrice);
            grandTotal += toys[i].getBillingAmount();
        }

        System.out.println("\nIndividual Toy Details:");
        for (Toy toy : toys) {
            System.out.println(toy);
        }

        System.out.printf("\nGrand Total: %.2f%n", grandTotal);

        scanner.close();
    }
}

class Toy {
    private int toyId;
    private String toyName;
    private int toyQty;
    private double toyPrice;

    public Toy(int toyId, String toyName, int toyQty, double toyPrice) {
        this.toyId = toyId;
        this.toyName = toyName;
        this.toyQty = toyQty;
        this.toyPrice = toyPrice;
    }

    public double getBillingAmount() {
        return toyQty * toyPrice;
    }

    @Override
    public String toString() {
        return "Toy ID: " + toyId + "\n" +
                "Toy Name: " + toyName + "\n" +
                "Toy Quantity: " + toyQty + "\n" +
                "Toy Price: " + toyPrice + "\n" +
                "Billing Amount: " + getBillingAmount();
    }
}