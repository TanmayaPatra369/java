public class FunctionOverloadingExample {
    public static void add() {
        System.out.println("No arguments passed");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static float add(int a, float b) {
        return a + b;
    }

    public static float add(float a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + add(5, 3));
        System.out.println("Sum: " + add(5, 3.5f));
        System.out.println("Sum: " + add(3.5f, 5));
    }
}