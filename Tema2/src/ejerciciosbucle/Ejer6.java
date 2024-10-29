package ejerciciosbucle;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		// Declaramos la variable que recoge el tamano de triangulo
		int n;
		
		// Abrimos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario el tamano y lo guardamos en la variable
		System.out.print("Introduce el tamaño del triángulo: ");
		n = reader.nextInt();

		for (int i = 1; i <= n; i++) {
			// Imprimimos los espacios a la izquierda
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// Imprimimos los asteriscos con espacios
			for (int k = 0; k < i + 1; k++) {
				System.out.print("* ");
			}
			// Salto de linea despues de cada fila
			System.out.println();
		}
		
		// Cerramos el Scanner
		reader.close();
	}
}