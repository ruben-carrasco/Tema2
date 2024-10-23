package boletinfor;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		// Creamos la variable de la suma
		int suma = 0;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos el for
		for (int i = 1; i <= 20; i += 2) {
			suma += i;
		}
		
		// Mostramos la suma en pantalla
		System.out.println("La suma de los 10 primeros números impares es: " + suma);

		// Cerramos el Scanner
		reader.close();
	}

}
