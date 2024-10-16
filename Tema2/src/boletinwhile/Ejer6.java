package boletinwhile;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
			
			// Declaramos la variable que recoge las alturas introducidas
			double altura;
			// Variable que recoge la altura más alta
			double masalto = 0;
			
			// Creamos el Scanner
			Scanner reader = new Scanner(System.in);
			
			// Pedimos las alturas al usuario y lo guardamos en la variable
			System.out.println("Introduzca la primera altura: ");
			altura = reader.nextInt();
			
			// Bucle hasta que la altura introducida sea -1
			while (altura != -1) {
				
				// Si la altura es mayor al valor de masalto lo guardamos en masalto el valor
				if (altura > masalto) {
					masalto = altura;
				}
				
				// Volvemos a pedir la altura	
				System.out.println("Introduzca la siguiente altura: ");
				altura = reader.nextInt();
				
			}
			
			// Mostramos el resultado
			System.out.println("El arbol más alto mide " + masalto );
			
			// Cerramos el Scanner
			reader.close();
		}
}