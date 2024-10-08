package boletinifelse;

import java.util.Scanner;

public class Ejer9 {
	public static void main(String[] args) {
		// Declaramos las variables para recojer el resultado de cada jugador
		String j1;
		String j2;
		// Declaramos las constantes
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERAS = "TIJERAS";
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos y leemos el resultado del jugador 1
		System.out.println("Jugador 1, elija PIEDRA, PAPEL o TIJERAS: ");
		j1 = reader.nextLine();
		
		// Pedimos y leemos el resultado del jugador 2
		System.out.println("Jugador 2, elija PIEDRA, PAPEL o TIJERAS: ");
		j2 = reader.nextLine();
				
		// Creamos los condicionales
		if ( j1.equals(j2)) {
			System.out.println("Hay empate");
		}
		else if (j1.equals(PIEDRA) && j2.equals(PAPEL)) {
			System.out.println("Gana jugador 2");
			
		}
		else if (j1.equals(PIEDRA) && j2.equals(TIJERAS)) {
			System.out.println("Gana jugador 1");
			
		}
		else if (j1.equals(PAPEL) && j2.equals(TIJERAS)) {
			System.out.println("Gana jugador 2");
			
		}
		else if (j1.equals(PAPEL) && j2.equals(PIEDRA)) {
			System.out.println("Gana jugador 1");
			
		}
		else if (j1.equals(TIJERAS) && j2.equals(PIEDRA)) {
			System.out.println("Gana jugador 2");
			
		}
		else {
			System.out.println("Gana jugador 1");
		}
		
		
		// Cerramos el Scanner
		reader.close();
	}

}
