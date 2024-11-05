package ejerciciosanterior;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		// Declaramos las variables
		int n = 0;
		boolean error;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Bucle que se repite si hay algun error
		do {
			try {
				// Pedimos el numero al usuario y lo guardamos en la variable
				System.out.println("Introduzca la medida de los lados: ");
				n = reader.nextInt();
				// Comprobamos que es mayor que 0, si lo es error = false y sale del bucle
				assert n < 0 : "El numero debe ser mayor que 0";
				error = false;
				// Si es un numero menor que 0 imprime el mensaje del assert y repite el bucle
			} catch (AssertionError e) {
				System.out.println(e.getMessage());
				error = true;
				// Si no se introduce un numero imprimimos la siguiente excepcion
			} catch (InputMismatchException e) {
				System.out.println("El numero no es entero.");
				error = true;
			}
			// Limpiamos la consola si introducimos un string
			finally {
				reader.nextLine();
			}
		} while (error);

		// for para cada cada fila
		for (int i = 1; i <= n; i++) {
			// for para los asteriscos
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();

		}

	}

}
