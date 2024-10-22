package boletincondicionales;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {

		// Declaramos las variables que recogen las horas, minutos y segundos
		int horas;
		int minutos;
		int segundos;

		// Creamos el escaner
		Scanner reader = new Scanner(System.in);

		// Pedimos al usuario la hora y la guardamos en la variable
		System.out.println("Introduzca hora: ");
		horas = reader.nextInt();

		// Pedimos al usuario los minutos y lo guardamos en la variable
		System.out.println("Introduzca los minutos: ");
		minutos = reader.nextInt();

		// Pedimos al usuario los segundos y lo guardamos en la variable
		System.out.println("Introduzca los segundos: ");
		segundos = reader.nextInt();

		// Creamos un if que se realice si el formato es correcto
		if ((horas >= 0 && horas < 24) && (minutos >= 0 && minutos < 60) && (segundos >= 0 && segundos < 60)) {

			// Operación de incrementar 1 segundo
			segundos = segundos + 1;

			// Creamos la relación entre dia horas minutos y segundos
			if (segundos == 60) {
				minutos = minutos + 1;
				segundos = 0;
			}

			if (minutos == 60) {
				horas = horas + 1;
				minutos = 0;
			}

			if (horas == 24) {
				horas = 0;
			}

			// Mostramos la hora, minutos y segundos
			System.out.println(horas + " : " + minutos + " : " + segundos);

		} else {
			System.out.println("El formado es incorrecto.");
		}

		// Cerramos el escaner
		reader.close();
	}
}