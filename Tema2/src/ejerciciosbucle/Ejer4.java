package ejerciciosbucle;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		
		// Declaramos la variable para el numero a
		int a;
		// Declaramos la variable para el numero b
		int b;
		// Variable que recoge el numero maximo introducido
		int max;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el numero a y lo guardamos en la variable
		System.out.println("Introduzca el numero a: ");
		a = reader.nextInt();
		
		// Pedimos el numero b y lo guardamos en la variable
		System.out.println("Introduzca el numero b: ");
		b = reader.nextInt();
		
		// Asignamos a la variable min el numero mas pequeno de entre a y b
		if (a <= b) {
			max = b;
		} else {
			max = a;
		}
		
		// Vamos con un for comprobando el primer numero que divide a ambos simultaneamente con resto 0
		for (int i = max ; i <= 99999; i++ ) {
			// Comprobamos si i i es divisor de ambos
			if (i % a == 0 && i % b == 0) {
				System.out.println("El minimo comun multiplo es: " + i);
				break;
			}
		}
		
		//Cerramos el Scanner
		reader.close();
	}

}
