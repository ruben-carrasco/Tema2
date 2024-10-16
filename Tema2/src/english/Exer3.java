package english;

import java.util.Scanner;

public class Exer3 {
	public static void main(String[] args) {

		// Variable that storage the height asked to the user
		double height;

		// Variable that storage the max height
		double max = 0;

		// Variable that storage the min height
		double min;

		// Create Scanner
		Scanner reader = new Scanner(System.in);

		// We ask the height to the user and save it inside the variable
		System.out.println("Introduce a height: ");
		height = reader.nextDouble();

		// We inizialice the variable with the value of height
		min = height;

		// We create a loop
		while (height != 0) {

			// If the height is greater than the max then the max equals to height
			if (height > max) {
				max = height;
			}

			// If the height is less than the min then the min equals to height
			if (height < min) {
				min = height;
			}

			// We ask the height to the user and save it inside the variable again
			System.out.println("Introduce a height: ");
			height = reader.nextDouble();

		}

		// We show the results
		if (min < 0 && max < 0) {
			System.out.println("The min height is: " + min);
			System.out.println("The max height is: " + max);
		} else {
			System.out.println("It cant be negative");
		}

		// Close Scanner
		reader.close();

	}

}
