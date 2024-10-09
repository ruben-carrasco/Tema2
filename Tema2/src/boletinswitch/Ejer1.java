package boletinswitch;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		// Creamos la variable que recoge la nota
		int nota;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos la nota al usuario y guardamos en la variable
		System.out.println("Introduzca su nota: ");
		nota = reader.nextInt();
		
		// Creamos el  switch que devuelva el resultado de la nota
		switch (nota) {
		case 0,1,2,3,4 ->
			System.out.println("Insuficiente");
		case 5 -> 
			System.out.println("Suficiente");
		case 6 ->
			System.out.println("Bien");
		case 7,8 ->
			System.out.println("Notable");
		case 9,10 ->
			System.out.println("Sobresaliente");
		}
		
		// Cerramos Scanner
		reader.close();
	}

}
