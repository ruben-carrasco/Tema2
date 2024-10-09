package boletinswitch;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		// Creamos la variable que recoge lel número del dia de la semana
		int numdia;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el número al usuario y guardamos en la variable
		System.out.println("Introduzca un número del 1 a 7: ");
		numdia = reader.nextInt();
		
		// Creamos el  switch que devuelva el día según el número
		switch (numdia) {
		case 1 ->
			System.out.println("Lunes");
		case 2 -> 
			System.out.println("Martes");
		case 3 ->
			System.out.println("Miercoles");
		case 4 ->
			System.out.println("Jueves");
		case 5 ->
			System.out.println("Viernes");
		case 6 ->
			System.out.println("Sabado");
		case 7 ->
			System.out.println("Domingo");
		}
		
		// Cerramos Scanner
		reader.close();
	}

}