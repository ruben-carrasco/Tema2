package boletinwhile;

import java.util.Scanner;

public class Ejer2 {

		public static void main(String[] args) {
			
			// Declaramos las variables
			int num;
			int contador = 0;
			
			// Creamos el Scanner
			Scanner reader = new Scanner(System.in);
			
			// Pedimos el número al usuario y lo guardamos en la variable
			System.out.println("Introduzca un número: ");
			num = reader.nextInt();
			
			// Vamos sumando al contador con el while y detenemos cuando sea negativo
			while (num >= 0) {
				contador++;
				
				System.out.println("Introduzca el siguiente número: ");
				num = reader.nextInt();
				
			}
			
			// Mostramos el resultado final
			System.out.println("Has introducido: " + contador + " números positivos");
			
			// Cerramos el Scanner
			reader.close();
		}
}