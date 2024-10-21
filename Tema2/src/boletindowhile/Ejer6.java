package boletindowhile;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		// Declaramos las variables para recojer el resultado de cada jugador
		String j1;
		String j2;
		// Declaramos las constantes
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERAS = "TIJERAS";

		// Variable para jugar de nuevo
		String jugar;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un Do que mientras la variable jugar no sea S, se repita
		do {
			// Pedimos y leemos el resultado del jugador 1
			do {
				System.out.println("Jugador 1, elija PIEDRA, PAPEL o TIJERAS: ");
				j1 = reader.nextLine();
			} while (!j1.equals("PIEDRA") && !j1.equals("PAPEL") && !j1.equals("TIJERAS"));

			// Pedimos y leemos el resultado del jugador 2
			do {
				System.out.println("Jugador 2, elija PIEDRA, PAPEL o TIJERAS: ");
				j2 = reader.nextLine();
			} while (!j2.equals("PIEDRA") && !j2.equals("PAPEL") && !j2.equals("TIJERAS"));

			// Creamos los condicionales
			if (j1.equals(j2)) {
				System.out.println("Hay empate");
			} else if (j1.equals(PIEDRA) && j2.equals(PAPEL)) {
				System.out.println("Gana jugador 2");

			} else if (j1.equals(PIEDRA) && j2.equals(TIJERAS)) {
				System.out.println("Gana jugador 1");

			} else if (j1.equals(PAPEL) && j2.equals(TIJERAS)) {
				System.out.println("Gana jugador 2");

			} else if (j1.equals(PAPEL) && j2.equals(PIEDRA)) {
				System.out.println("Gana jugador 1");

			} else if (j1.equals(TIJERAS) && j2.equals(PIEDRA)) {
				System.out.println("Gana jugador 2");

			} else {
				System.out.println("Gana jugador 1");
			}
			System.out.print("¿Desea jugar de nuevo?: ");
			jugar = reader.nextLine();

		} while (jugar.equals("S"));

		// Cerramos el Scanner
		reader.close();
	}

}