package boletindowhile;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		// Declaramos la variable que recoge los números pares
		int par = 0;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Creamos el do-while
		do {
				par += 2;
				System.out.println(par);
		}
		while (par < 200);
		
		// Cerramos el Scanner
		reader.close();
	}

}
