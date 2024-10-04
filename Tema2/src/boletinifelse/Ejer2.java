package boletinifelse;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		// Creamos la variable que recojan los números que solicitamos al usuario
		int num1;
		int num2;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario el número 1
		System.out.println("Introduzca el primer número: ");
		num1 = reader.nextInt();
		
		// Pedimos al usuario el número 2
		System.out.println("Introduzca el primer número: ");
		num2 = reader.nextInt();
		
		// Creamos el if
		if (num1 == num2) {
		System.out.println("Son iguales");
		}
		else {
		System.out.println("No son iguales");
		}
				
		//Cerramos el Scanner
		reader.close();
	}

}
