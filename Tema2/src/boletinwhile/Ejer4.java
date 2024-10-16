package boletinwhile;

import java.util.Scanner;

public class Ejer4 {

		public static void main(String[] args) {
			
			// Declaramos la variable que recoge los números introducidos por el usuario
			double num;
			// Variable que recoge la suma de los positivos
			double sumaPositivos = 0;
			// Variable que recoge la suma de los negativos
			double sumaNegativos = 0;
			// Variable que recoge la cantidad de números negativos
			int contadorNegativos = 0;
			// Variable que recoge la cantidad de números para detener en 10
			int contador = 1;
			// Variable que recoge la cantidad de ceros
			int contadorCero = 0;
			
			// Creamos el Scanner
			Scanner reader = new Scanner(System.in);
			
			// Pedimos el número al usuario y lo guardamos en la variable
			System.out.println("Introduzca un número: ");
			num = reader.nextInt();
			
			// Vamos sumando con el while y detenemos cuando sea negativo
			while (contador < 10) {
				contador++;
				if (num > 0) { 
					sumaPositivos += num;
				}
				else if (num < 0) { 
					sumaNegativos += num;
					contadorNegativos++;
				}
				else {
					contadorCero++;
				}
				
				System.out.println("Introduzca el siguiente número: ");
				num = reader.nextInt();
				
			}
			
			// Mostramos el resultado final
			System.out.println("La suma de los positivos es: " + sumaPositivos);
			
			System.out.println("La media de los negativos es: " + sumaNegativos / contadorNegativos);
			
			System.out.println("Número de ceros: " + contadorCero);
			
			// Cerramos el Scanner
			reader.close();
		}
}
