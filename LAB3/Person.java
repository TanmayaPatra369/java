public class Personpublic class MyClass {
    private static int count;

    static {
        count = 10;
        System.out.println("Static block executed");
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Count is: " + MyClass.getCount());
    }
} {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        name = "John Doe";
        age = 30;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void question1(String[] args) {
        // Create an object using the default constructor
        Person person1 = new Person();
        System.out.println("Person 1: " + person1.getName() + ", " + person1.getAge());

        // Create an object using the parameterized constructor
        Person person2 = new Person("Jane Doe", 25);
        System.out.println("Person 2: " + person2.getName() + ", " + person2.getAge());
    }
}