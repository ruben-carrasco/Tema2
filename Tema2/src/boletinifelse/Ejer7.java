package boletinifelse;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		// Creamos la variable que recoja el número
		int numero;
		
		// Creamos Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el número al usuario y lo guardamos en la variable
		System.out.println("Introduzca un número: ");
		numero = reader.nextInt();
		
		// Comprobamos que esté entre 0 y 99999 y si es así comprobamos las cifras
		if (numero >= 0 && numero <= 99999) {
			if (numero >= 0 && numero <= 9) {
				System.out.println("El número es de una cifra.");
			}
			else if (numero >= 10 && numero <= 99) {
				System.out.println("El número es de dos cifras.");
			}
			else if (numero >= 100 && numero <= 999) {
				System.out.println("El número es de tres cifras.");
			}
			else if (numero >= 1000 && numero <= 9999) {
				System.out.println("El número es de cuatro cifras.");
			}
			else  {
				System.out.println("El número es de cinco cifras.");
			}
		}
		else {
			System.out.println("El número debe estar entre 0 y 99999.");
		}
		
		// Cerramos el Scanner
		reader.close();

	}

}
