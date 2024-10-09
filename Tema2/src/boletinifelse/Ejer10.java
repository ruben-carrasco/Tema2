package boletinifelse;

import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
		// Declaramos las variables para recojer el los 3 números
		int num1;
		int num2;
		int num3;

		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos y leemos el numero 1
		System.out.println("Introduzca el número 1: ");
		num1 = reader.nextInt();
		
		// Pedimos y leemos el numero 2
		System.out.println("Introduzca el número 2: ");
		num2 = reader.nextInt();
		
		// Pedimos el número 3
		System.out.println("Introduzca el número 3: ");
		num3 = reader.nextInt();		
		
		// Creamos los condicionales
		if ( (num1 + num2) == num3 ) {
			System.out.println("La suma de del numero 1 y el numero 2 es igual que el numero 3");
		}
		else if ( (num1 + num3) == num2 ) {
			System.out.println("La suma de del numero 1 y el numero 3 es igual que el numero 2");
		}
		else if ( (num2 + num3) == num1 ) {
			System.out.println("La suma de del numero 2 y el numero 3 es igual que el numero 1");
			}
		else {
			System.out.println("No hay suma de dos números que sea igual al otro");
		}
		
		// Cerramos el Scanner
		reader.close();
	}

}