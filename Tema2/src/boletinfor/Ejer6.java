package boletinfor;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		// Declaramo la variable de la nota
		int nota;

		// Contador de suspensos
		int suspensos = 0;
		
		// Declaramos la constante de suspenso
		final int APROBADO = 5;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Creamos el for
		for (int i = 1; i <= 5; i++) {
			// Pedimos la nota al usuario y la guardamos en la variable
			System.out.println("Introduzca una nota: ");
			nota = reader.nextInt();
			// Comprobamos si hay suspensos
			if (nota < APROBADO) {
				suspensos++;
			}
		}
		
		// Imprimimos en pantalla si hay suspensos o no haciendo uso de un ternario
		System.out.println(suspensos > 0 ? "Hay " + suspensos + " suspensos" : "No hay suspensos");

		// Cerramos el Scanner
		reader.close();
	}

}
