import java.util.Scanner;
import java.util.Arrays;

public class SortNumbersExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int numElements = scanner.nextInt();

        int[] numbers = new int[numElements];

        System.out.println("Enter " + numElements + " numbers:");
        for (int i = 0; i < numElements; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("\nSorted Numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}