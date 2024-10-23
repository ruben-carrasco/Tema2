package boletinfor;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		
		// Declaramos la variable que recoge el número introducido por el usuario
		int n;
		// Variable que cuenta los números múltiplos
		int contador = 0;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el número al usuario y lo guardamos en la variable
		System.out.println("Introduzca el número: ");
		n = reader.nextInt();
		
		// Creamos el for
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				contador++;
			}
		}
		
		// Mostramos el recuento
		System.out.println("Del 1 al " + n + " hay " + contador + " números múltiplos de 3");
		
		// Cerramos el Scanner
		reader.close();
	}

}
