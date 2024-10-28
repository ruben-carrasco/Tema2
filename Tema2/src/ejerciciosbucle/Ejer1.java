package ejerciciosbucle;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		// Variable que recoge las horas introducidas por el usuario
		int horas;
		// Variable que recoge los minutos introducidas por el usuario
		int minutos;
		// Variable que recoge los segundos introducidas por el usuario
		int segundos;
		// Variable que recoge el incremento introducido por el usuario
		int incrementoSeg;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos al usuario las horas y las guardamos en la variable
		System.out.println("Introduzca la hora: ");
		horas = reader.nextInt();

		// Pedimos al usuario los minutos y los guardamos en la variable
		System.out.println("Introduzca los minutos: ");
		minutos = reader.nextInt();

		// Pedimos al usuario los segundos y los guardamos en la variable
		System.out.println("Introduzca los segundos: ");
		segundos = reader.nextInt();

		// Pedimos al usuarios los segundos a incrementar y los guardamos en la variable
		System.out.println("Introduzca los segundos a incrementar: ");
		incrementoSeg = reader.nextInt();

		if (horas < 24 && minutos < 60 && segundos < 60) {
			// Creamos un for que para incrementar los segundos
			for (int i = 0; i < incrementoSeg; i++) {
				
				segundos++;
				
				if (segundos == 60) {
					segundos = 0;
					minutos += 1;
				}

				if (minutos == 60) {
					minutos = 0;
					horas += 1;
				}

				if (horas == 24) {
					horas = 0;
					minutos = 0;
					horas = 0;
				}
			}
		} else {
			System.out.println("Introduzca una hora correcta");
		}

		System.out.println("La hora incrementada es: " + (horas < 10 ? "0" + horas : horas) + ":"
				+ (minutos < 10 ? "0" + minutos : minutos) + ":" + (segundos < 10 ? "0" + segundos : segundos));

		// Cerramos el Scanner
		reader.close();

	}

}
