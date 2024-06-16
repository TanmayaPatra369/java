public class TypeConversionExample {
    public static void main(String[] args) {
        // Type Conversion
        int a = 10;
        double b = a; // implicit type conversion (int to double)
        System.out.println("a = " + a + ", b = " + b);

        double c = 12.5;
        int d = (int) c; // explicit type casting (double to int)
        System.out.println("c = " + c + ", d = " + d);

        // Type Casting
        byte e = 10;
        int f = e; // implicit type casting (byte to int)
        System.out.println("e = " + e + ", f = " + f);

        int g = 200;
        byte h = (byte) g; // explicit type casting (int to byte)
        System.out.println("g = " + g + ", h = " + h);
    }
}