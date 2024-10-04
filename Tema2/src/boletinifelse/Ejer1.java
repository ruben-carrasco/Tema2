package boletinifelse;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		// Creamos la variable que recoja el número que solicitamos al usuario
		int num;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario el número
		System.out.println("Introduzca un número: ");
		num = reader.nextInt();
		
		// Creamos el if, si el número entre 2 da 0 es par
		if (num % 2 == 0) {
			System.out.println("El número es par");
		}
		else {
			System.out.println("El número es impar");
		}
		
		//Cerramos el Scanner
		reader.close();
	}

}
