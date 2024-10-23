package boletinfor;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		
		// Declaro la variable que recoge el número
		int num;
		boolean primo = false;
		boolean d1 = false;
		boolean d2 = false; 
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el número al usuario y lo guardamos en la variable
		System.out.println("Introduzca un número: ");
		num = reader.nextInt();
		
		for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					d1 = true;
					break;
				}
				else {
					d1 = false;
					break;
				}
		}
		
		for (int i = num + 1; i < 9999999; i++) {
			
			if (num % i == 0) {
				d2 = true;
				break;
			}
			else {
				d2 = false;
				break;
			}
	}
		
		if (d1 && d2) { 
			System.out.println("El número no es primo");
		}
		else {
			System.out.println("El número es primo");
		}
		
		// Cerramos el Scanner
		reader.close();
	}

}
