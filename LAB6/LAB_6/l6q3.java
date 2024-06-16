

import java.util.Scanner;

class l6q3 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the integers in the Array : ");
            try {
                for (int i = 0; i < 5; i++) {
                    arr[i] = sc.nextInt();
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.print("EXCEPTION FOUND: " + e);
            }
        }
    }
}