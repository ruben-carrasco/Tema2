package boletinfor;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {

		// Declaro la variable que recoge el número
		int num;
		boolean esPrimo = true;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos el número al usuario y lo guardamos en la variable
		System.out.println("Introduzca un número: ");
		num = reader.nextInt();

		if (num > 0) {
			// Comprobamos si desde 2 hasta la raiz del numero hay un divisor
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					// Si no lo hay esPrimo pasa a false
					esPrimo = false;
					break;
				}
			}
			// Si es menor que 0 da error
		} else if (num == 1) {
			System.out.println("Hay 0 primos");
		} else {
			System.out.println("Introduzca un número correcto");
		}

		// Mostramos el resultado
		if (esPrimo) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}

		// Cerramos el Scanner
		reader.close();
	}

}
