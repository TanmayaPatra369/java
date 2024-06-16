class SuperrClass {
    private int id;
    private String name;

    public SuperrClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class SuperClass extends SuperrClass {
    private double price;

    public SuperClass(int id, String name, double price) {
        super(id, name); // Calling the constructor of the superclass
        this.price = price;
    }

    public void displayPrice() {
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        SuperClass obj = new SuperClass(1, "Product 1", 10.5);
        obj.display();

        obj.displayPrice();
    }
}