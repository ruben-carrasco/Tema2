package boletinfor;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {

		// Declaramos la variable que recoge el número
		double num;
		// Variable que recoge la suma de los números
		double suma = 0;

		// Declaramos una constante para las iteraciones
		final int ITER = 10;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		for (int i = 1; i <= ITER; i++) {
			// Pedimos los números al usuario y lo guardamos en la variable
			System.out.println("Introduzca un número: ");
			num = reader.nextDouble();
			suma += num;

		}

		System.out.println("La media es: " + suma / ITER);

		// Cerramos el Scanner
		reader.close();
	}
}
