package ejerciciosbucle;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {

		// Declaro la variable que recoge el número máximo
		int numMax;
		// Booleano que dice si es o no primo
		boolean esPrimo;
		// Contador de primos
		int contador = 0;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos el número al usuario y lo guardamos en la variable
		System.out.println("Introduzca un número máximo: ");
		numMax = reader.nextInt();
		
		// Si es mayor que 0 verifica si es primo
		if (numMax > 0) {
			// Bucle que incrementa i en 1 hasta el num max por iteración
			for (int i = 2; i <= numMax; i++) {
				esPrimo = true;
				// Verifica si desde 2 hasta el número i es divisible
				for (int j = 2; j <= Math.sqrt(i); j++) {
					if (i % j == 0) {
						// Si no lo hay esPrimo pasa a false
						esPrimo = false;
						break;
					}
				}
				if (esPrimo) {
					contador++;
				}
			}
			// Si es 1 hay 0 primos
		} else if (numMax == 1) {
			System.out.println("Hay 0 primos");
		} else {
			// Si es menor que 0 da error
			System.out.println("Introduzca un número correcto");
		}

		// Mostramos el resultado

		System.out.println("Hay " + contador + " numeros primos");

		// Cerramos el Scanner
		reader.close();
	}

}
