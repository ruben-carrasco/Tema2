package english;

import java.util.Scanner;

public class Exer2 {
	public static void main(String[] args) {
		// We create the variable that storage the number requested to the user
		int num;
		int counter = 0;

		// Create Scanner
		Scanner reader = new Scanner(System.in);

		// We ask the number to the user and save it inside the variable
		System.out.println("Introduce a number: ");
		num = reader.nextInt();

		// We create the loop
		while (counter < 10) {

			// We create a counter
			counter++;

			System.out.println(num + " x " + counter + " = " + num * counter);
		}

		// Close Scanner
		reader.close();
	}

}
