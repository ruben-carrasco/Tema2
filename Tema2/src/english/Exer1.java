package english;

import java.util.Scanner;

public class Exer1 {
	public static void main(String[] args) {
		// First, we create the variable where we are going to storage the numbers
		int num;

		// Create Scanner
		Scanner reader = new Scanner(System.in);

		// We request the number to the user and save it in the variable
		System.out.println("Introduce a number: ");
		num = reader.nextInt();

		// We create the loop, it will work until the user introduces a negative number
		while (num > 0) {
			// It shows if the number is even or odd
			System.out.println(num % 2 == 0 ? "Even number" : "Odd number");

			// We request the number to the user again
			System.out.println("Introduce a number: ");
			num = reader.nextInt();
		}

		System.out.println("End");

		// Close Scanner
		reader.close();
	}

}
