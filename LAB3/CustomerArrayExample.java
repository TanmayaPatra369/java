import java.util.Scanner;

class Customer {
    private String name;
    private String cell;
    private String packageType;
    private int age;

    public Customer() {
        this.name = "";
        this.cell = "";
        this.packageType = "";
        this.age = 0;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter cell: ");
        this.cell = scanner.nextLine();

        System.out.print("Enter package type: ");
        this.packageType = scanner.nextLine();

        System.out.print("Enter age: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); 
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Cell: " + this.cell);
        System.out.println("Package: " + this.packageType);
        System.out.println("Age: " + this.age);
        System.out.println();
    }
}

public class CustomerArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int numCustomers = scanner.nextInt();

        Customer[] customers = new Customer[numCustomers];

        for (int i = 0; i < numCustomers; i++) {
            customers[i] = new Customer();
            System.out.println("Enter details for customer " + (i + 1) + ":");
            customers[i].input();
        }

        System.out.println("\nCustomer Details:");
        for (Customer customer : customers) {
            customer.display();
        }

        scanner.close();
    }
}