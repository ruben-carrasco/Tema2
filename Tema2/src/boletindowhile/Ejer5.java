package boletindowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		
		// Declaramos la variable de la respuesta
		String respuesta = "";
		
		// Declaramos la variable del número random
		int numrandom = 0;
		
		// Variable que recoge el numero max
		int numax = 100;
		
		// Variable que recoge el numero min
		int numin = 1;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos el Random
		Random rand = new Random();

		// Creamos el do-while
		do {
			
			// Si la respuesta es menor el num max pasa a ser el num random - 1
			if (respuesta.equals("menor")) {
				numax = numrandom - 1;
			}
			// Si la respuesta es mayor el num min pasa a ser el num random + 1
			else if (respuesta.equals("mayor")) {
				numin = numrandom + 1;
			}
			
			// Guardamos un número random con el intervalo 	
			numrandom = rand.nextInt(numin, numax + 1);
			
			// Mostramos el número al usuario
			System.out.println(numrandom);	
			
			// Pedimos la respuesta y la guardamos en la variable
			System.out.print("Es menor, mayor o igual: ");
			respuesta = reader.nextLine();
			
		} while (!respuesta.equals("igual"));
		
		// Si adivina lo mostramos al usuario
		System.out.println("He adivinado!");

		// Cerramos el Scanner
		reader.close();
	}

}
