package boletinwhile;

import java.util.Scanner;

public class Ejer3 {

		public static void main(String[] args) {
			
			// Declaramos las variables
			double num;
			// Variable que recoge la suma
			double numSumado = 0;
			// Variable que recoge la cantidad de números para poder hacer la media
			int contador = 0;
			
			// Creamos el Scanner
			Scanner reader = new Scanner(System.in);
			
			// Pedimos el número al usuario y lo guardamos en la variable
			System.out.println("Introduzca un número: ");
			num = reader.nextInt();
			
			// Vamos sumando con el while y detenemos cuando sea negativo
			while (num >= 0) {
				contador++;
				numSumado += num;
				
				System.out.println("Introduzca el siguiente número: ");
				num = reader.nextInt();
				
			}
			
			// Mostramos el resultado final
			System.out.println("La media de todos los números es: " + numSumado / contador);
			
			// Cerramos el Scanner
			reader.close();
		}
}
