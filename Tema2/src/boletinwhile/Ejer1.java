package boletinwhile;

import java.util.Scanner;

public class Ejer1 {

		public static void main(String[] args) {
			
			// Declaramos la variable que recoge el numero
			int num;
			// Declaramos la variable que recoge la suma
			int numSumado = 0;
			
			// Creamos el Scanner
			Scanner reader = new Scanner(System.in);
			
			// Pedimos el número al usuario y lo guardamos en la variable
			System.out.println("Introduzca un número: ");
			num = reader.nextInt();
			
			// Vamos sumando con el while y detenemos cuando sea negativo
			while (num >= 0) {
				numSumado += num;
				// Pedimos de nuevo el numero
				System.out.println("Introduzca el siguiente número: ");
				num = reader.nextInt();
				
			}
			
			// Mostramos el resultado final
			System.out.println("El resultado de las sumas es: " + numSumado);
			
			// Cerramos el Scanner
			reader.close();
		}
}
