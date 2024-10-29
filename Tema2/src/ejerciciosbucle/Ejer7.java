package ejerciciosbucle;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		// Declaramos la variable que recoge el numero n
		int n;

		// Abrimos el Scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos al usuario el numero n y lo guardamos en la variable
		System.out.print("Introduce el numero n: ");
		n = reader.nextInt();

		// Primer for para imprimir hasta n filas
		for (int i = 1; i <= n; i++) {
			// Segundo for para imprimir los numeros crecientes
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				// Segundo for para imprimir los numeros decrecientes
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);

			}
			// Salto en cada linea
			System.out.println();
		}

		// Cerramos el Scanner
		reader.close();
	}
}