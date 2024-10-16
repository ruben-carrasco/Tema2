package boletinwhile;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
			
			// Declaramos la variable que recoge las alturas introducidas
			double altura;
			double masalto = 0;
			
			// Creamos el Scanner
			Scanner reader = new Scanner(System.in);
			
			// Pedimos las alturas al usuario y lo guardamos en la variable
			System.out.println("Introduzca la primera altura: ");
			altura = reader.nextInt();
			
			// Vamos sumando con el while y detenemos cuando sea negativo
			while (altura != -1) {
				
				if (altura > masalto) {
					masalto = altura;
				}
					
				System.out.println("Introduzca la siguiente altura: ");
				altura = reader.nextInt();
				
			}
			
			// Mostramos el resultado
			System.out.println("El arbol más alto mide " + masalto );
			
			// Cerramos el Scanner
			reader.close();
		}
}