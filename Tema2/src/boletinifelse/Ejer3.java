package boletinifelse;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		// Variable que recoge el número
		float num;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el número al usuario
		System.out.println("Introduzca un número");
		num = reader.nextFloat();
		
		// Creamos el if
		if (num >= 1 || num <= -1) {
			System.out.println("El número no se considera casi-cero");
		}
		else if (num == 0) {
			System.out.println("El número no puede ser 0");
		}
		else {
			System.out.println("El número es casi-cero");
		}
		
		// Cerramos el Scanner
		reader.close();
	}

}
