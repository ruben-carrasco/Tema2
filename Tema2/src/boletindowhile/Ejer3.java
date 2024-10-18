package boletindowhile;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		// Variable que recoge el numero N hasta el que sumar
		int num;
		// Variable contador que almacena hasta el número N
		int contador = 0;
		// Variable que recoge la suma total de los números
		int suma = 0;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos al usuario que introduzca un número y lo guardamos en la variable
		System.out.println("Introduzca un número: ");
		num = reader.nextInt();

		// Creamos el do-while
		do {
			suma += contador++;
		} while (contador <= num);

		// Mostramos el resultado
		System.out.println("La suma es: " + suma);

		// Cerramos el Scanner
		reader.close();
	}

}
