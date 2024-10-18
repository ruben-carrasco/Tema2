package boletindowhile;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		// Declaramos la variable que recogerá los números
		int num=1;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Creamos el do - while
		do {
			System.out.println(num);
			num++;
		}
		while (num <= 20);
		
		// Cerramos el Scanner
		reader.close();
	}
}
