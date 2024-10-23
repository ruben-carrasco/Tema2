package boletinfor;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		
		// Declaramos la variable que recoge el número introducido por el usuario
		int n;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el número al usuario y lo guardamos en la variable
		System.out.println("Introduzca el número: ");
		n = reader.nextInt();
		
		// Creamos el for
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		
		// Cerramos el Scanner
		reader.close();
	}

}
