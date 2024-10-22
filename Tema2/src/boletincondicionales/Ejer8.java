package boletincondicionales;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {

		// Variable que recoge los días del mes
		int dias;
		// Variable que recoge el mes
		int mes;
		// Variable que recoge el año
		int año;

		// Creamos el escáner
		Scanner reader = new Scanner(System.in);

		// Pedimos al usuario el número de mes y lo guardamos
		System.out.println("Introduzca el mes: ");
		mes = reader.nextInt();

		// Pedimos al usuario el número de año
		System.out.println("Introduzca el año: ");
		año = reader.nextInt();

		// Creamos el switch para los meses de 30/31 días
		dias = switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> {
			yield 31;
		}
		case 4, 6, 9, 11 -> {
			yield 30;
		}
		case 2 -> {
			if (año % 4 == 0) {
				yield 29;
			} else {
				yield 28;
			}
		}
		default -> {
			System.out.println("Introduzca un mes correcto");
			yield -1;
		}
		};
		
		// Escribimos por pantalla el resultado
		System.out.println("El mes tiene: " + dias + " dias.");

		// Cerramos el escáner
		reader.close();

	}
}