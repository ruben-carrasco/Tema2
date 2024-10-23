package boletinfor;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		
		// Declaramos la variable para el número A
		int a;
		
		// Declaramos la variable para el número B
		int b;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el primer numero al usuario y lo guardamos
		System.out.println("Introduzca el número A: ");
		a = reader.nextInt();
		
		// Pedimos el segundo numero al usuario y lo guardamos
		System.out.println("Introduzca el número B: ");
		b = reader.nextInt();
		
		if (a < b) {
			for (int i = a; i <= b; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = b; i <= a; i++) {
				System.out.println(i);
			}
		}
		
		// Cerramos el Scanner
		reader.close();
	}
}

