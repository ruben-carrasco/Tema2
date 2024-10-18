package english;

import java.util.Random;
import java.util.Scanner;

public class Exer4 {
	public static void main(String[] args) {
		// We create the variable to storage the user number
		int num;
		// We create the variable to storage the random number
		int rand;
		
		// Create Random
		Random random = new Random();
		
		// Create Scanner
		Scanner reader = new Scanner(System.in);
		
		// We save the random number inside a variable
		rand = random.nextInt(1,101);
		
		// We ask the number to the user and save it inside the variable
		System.out.println("Introduce a number: ");
		num = reader.nextInt();
		
		// We create the loop
		while (num != rand && num != -1) {
			if (num < rand) {
				System.out.println("Random number is higher");
			}
			else {
				System.out.println("Random number is smaller");
			}
			
			// We ask the number to the user and save it inside the variable again
			System.out.println("Try again: ");
			num = reader.nextInt();
			
		}
		
		System.out.println(num == -1 ? "You lose" : "You win!, the number was: " + num);
	}

}
