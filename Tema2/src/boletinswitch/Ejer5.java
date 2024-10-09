package boletinswitch;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		// Creamos la variable que recoge la letra del carnet introducida
		String letra;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el número la letra al usuario y guardamos en la variable
		System.out.println("Introduzca la letra del carnet (E, D, C, A o B): ");
		letra = reader.next();
		
		// Creamos el  switch que devuelva el tipo de vehículo según la letra
		switch (letra) {
		case "E" ->
			System.out.println("Remolques");
		case "D" -> 
			System.out.println("Autobuses");
		case "C" ->
			System.out.println("Camiones");
		case "A" ->
			System.out.println("Motocicletas");
		case "B" ->
			System.out.println("Autobuses");
		default -> 
			System.out.println("Categoría no contemplada");
		}
		
		// Cerramos Scanner
		reader.close();
	}

}