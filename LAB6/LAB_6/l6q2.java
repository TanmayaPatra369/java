

import java.util.Scanner;

class l6q2 {
	public static void main(String[] args) {
		int x, y, z;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the value of numerator : ");
			x = sc.nextInt();
			System.out.print("Enter the value of denominator : ");
			y = sc.nextInt();
		}
		try {
			z = x / y;
			System.out.print(z);

			System.out.print("Program running");

		} catch (ArithmeticException e) {
			System.out.print("EXCEPTION CAUGHT: " + e);
		}
		System.out.println();
	}
}