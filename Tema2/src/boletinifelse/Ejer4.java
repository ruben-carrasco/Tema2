package boletinifelse;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		// Variables que recogen el número 1 y numero 2
		double num1;
		double num2;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el número 1 al usuario
		System.out.println("Introduzca un número 1: ");
		num1 = reader.nextDouble();
		
		// Pedimos el número 2 al usuario
		System.out.println("Introduzca un número 2: ");
		num2 = reader.nextDouble();
		
		// Creamos los condicionales
		if (num1 < num2) {
			System.out.println(num1 + "< " + num2);
		}
		else {
			System.out.println(num2 + "< " + num1);
		}
		
		// Cerramos el Scanner
		reader.close();
	}

}