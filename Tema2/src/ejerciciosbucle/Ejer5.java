package ejerciciosbucle;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		// Declaramos la variable para recoger el numero entero entre 0 y 20
		int n;
		int contador;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos el numero al usuario y lo guardamos en la variable
		System.out.println("Introduzca un numero: ");
		n = reader.nextInt();

		// Comprobacion de errores
		if (n < 20 && n > 0) {// Creamos un bucle anidado que imprime el numero i tantas veces como el valor
								// de este sea
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(i);
				}
				System.out.println();
			}
		} else {
			System.out.println("Introduzca un numero entre 0 y 20");
		}

		// Cerramos el Scanner
		reader.close();
	}
}
