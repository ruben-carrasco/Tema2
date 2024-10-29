package ejerciciosbucle;

import java.util.Scanner;

public class Ejer9 {
	public static void main(String[] args) {
		// Declaramos la variable que recoge el numero introducido por el usuario
		int n;
		// Variable para contar los digitos
		int digitos = 0;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un bucle do-while para pedir el numero de nuevo si es erroneo
		do {
			// Pedimos el numero al usuario y lo guardamos en la variable
			System.out.println("Introduzca un numero: ");
			n = reader.nextInt();
		} while (n <= 0);


		// Creamos un bucle while para contar digitos
		while (n != 0) {
			// Quitamos el ultimo digito de n hasta que llegue a 0 la division, denotando que no quedan mas digitos por contar
			n /= 10;
			digitos++;
		}
		
		System.out.println("Digitos: " + digitos );

		// Cerramos el Scanner
		reader.close();
	}

}
