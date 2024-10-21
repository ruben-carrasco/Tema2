package boletindowhile;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		
		// Creamos las variables para recoger los resultados de las tiradas en formato cadena
		String tirada1;
		String tirada2;
		
		// Variables para recoger el resultado en formato números
		int tirada1fin;
		int tirada2fin;
		
		// Creamos el String
		Scanner reader = new Scanner(System.in);
		
		do {
			// Pedimos al usuario el resultado de la primera tirada y lo guardamos
			System.out.println("Introduzca el resultado de su primera tirada: ");
			tirada1 = reader.next();
		} while (
					!tirada1.equals("UNO") &&
					!tirada1.equals("DOS") &&
					!tirada1.equals("TRES") &&
					!tirada1.equals("CUARTRO") &&
					!tirada1.equals("CINCO") &&
					!tirada1.equals("SEIS")
			);
		
		do {
			// Pedimos al usuario el resultado de la segunda tirada y lo guardamos
			System.out.println("Introduzca el resultado de su segunda tirada: ");
			tirada2 = reader.next();
		} while (
				!tirada2.equals("UNO") &&
				!tirada2.equals("DOS") &&
				!tirada2.equals("TRES") &&
				!tirada2.equals("CUARTRO") &&
				!tirada2.equals("CINCO") &&
				!tirada2.equals("SEIS")
		);
		
		// Creamos switch para asignar el resultado numérico de la tirada 1 a una variable
		tirada1fin = switch (tirada1) {
		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		default -> {
			yield 6;
		}
		};
		
		// Creamos switch para asignar el resultado numérico de la tirada 2 a una variable
		tirada2fin = switch (tirada2) {
		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		default -> {
			yield 6;
		}
		};
		
		// Hacemos la suma y lo mostramos al usuario
		System.out.println("La suma es: " + (tirada1fin + tirada2fin));
		
		// Cerramos el String
		reader.close();
	}

}
