package boletindowhile;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		// Declaramos la variable que recoge el número introducido por el usuario
		int num;
		
		// Declaramos la variable contador
		int contador = 1;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el número al usuario y lo guardamos
		System.out.println("Introduzca un número: ");
		num = reader.nextInt();
		
		// Creamos el do-while
		do {
			System.out.println(num + " x " + contador + " = " + num * contador++);
		} while (contador <= 10);
		
		// Cerramos el Scanner
		reader.close();
	}

}
