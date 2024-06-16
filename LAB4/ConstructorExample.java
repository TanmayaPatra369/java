public class ConstructorExample {
    private int id;
    private String name;

    // Default Constructor
    public ConstructorExample() {
        id = 0;
        name = "";
    }

    // Parameterized Constructor
    public ConstructorExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overloaded Constructors
    public ConstructorExample(int id) {
        this.id = id;
        this.name = "";
    }

    public ConstructorExample(String name) {
        this.id = 0;
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        // Using Default Constructor
        ConstructorExample obj1 = new ConstructorExample();
        obj1.display();

        // Using Parameterized Constructor
        ConstructorExample obj2 = new ConstructorExample(1, "John");
        obj2.display();

        // Using Overloaded Constructors
        ConstructorExample obj3 = new ConstructorExample(2);
        obj3.display();

        ConstructorExample obj4 = new ConstructorExample("Smith");
        obj4.display();
    }
}