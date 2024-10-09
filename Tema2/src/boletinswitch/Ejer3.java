package boletinswitch;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		// Creamos las variables que recogen los dos número que pedimos al usuario
		double num1;
		double num2;
		// Variable que recoge la opción del menu que introduce el usuario
		String opcion;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el número 1 al usuario y guardamos en la variable
		System.out.println("Introduzca el primer número: ");
		num1 = reader.nextDouble();
		
		// Pedimos el número 2 al usuario y guardamos en la variable
		System.out.println("Introduzca el segundo número: ");
		num2 = reader.nextDouble();
		
		// Creamos el menú
		System.out.println("A. SUMAR LOS NÚMEROS");
		System.out.println("B. RESTAR LOS NÚMEROS");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("D. DIVIDIR LOS NÚMEROS");
		
		// Pedimos al usuario que seleccione una opción y recojemos el valor
		System.out.println("Elija una opción de las anteriores (A, B, C o D): ");
		opcion = reader.next();
		
		// Creamos el  switch que devuelva el día según el número
		switch (opcion) {
		case "A" -> {
			System.out.println("La suma es: " + (num1 + num2));
		}
		case "B" -> {
			System.out.println("La resta es: " + (num1 - num2));
		}
		case "C" -> {
			System.out.println("La multiplicación es: " + (num1 * num2));
		}
		case "D" -> {
			System.out.println("La división es: " + (num1 / num2));
		}
		default -> 
			System.out.println("Introduzca una opción correcta");
		}
		
		// Cerramos Scanner
		reader.close();
	}

}