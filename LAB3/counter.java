//Program on static variable

public class Counter {
    private static int count = 0; // static variable

    public Counter() {
        count++; // increment the static variable
    }

    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        System.out.println("Number of objects created: " + Counter.count);
    }
}