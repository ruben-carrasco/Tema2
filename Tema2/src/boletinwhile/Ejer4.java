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
			int contador = 0;
			// Variable que recoge la cantidad de ceros
			int contadorCero = 0;
			
			// Creamos el Scanner
			Scanner reader = new Scanner(System.in);
					
			// Creamos el bucle y detenemos cuando llegue a 10 el contador
			while (contador < 10) {
				// Pedimos el número y lo leemos
				System.out.println("Introduzca un número: ");
				num = reader.nextInt();
				//Sumamos 1 al contador
				contador++;
				// Si el numero es positivo sumamos en sumaPositivos
				if (num > 0) { 
					sumaPositivos += num;
				}
				// Si el numero es negativo sumamos en sumaNegativos y contamos sumamos 1 al contador de negativos 
				else if (num < 0) { 
					sumaNegativos += num;
					contadorNegativos++;
				}
				// Si es 0 sumamos 1 al contador de ceros
				else {
					contadorCero++;
				}
				
			}
			
			// Mostramos los resultados finales
			System.out.println("La suma de los positivos es: " + sumaPositivos);
			// Si no introduce num negativos con el ternario decimos que no lo ha introducido
			System.out.println(contadorNegativos == 0 ? "No has introducido números negativos" : "La media de los negativos es: " + sumaNegativos / contadorNegativos);
			
			System.out.println("Número de ceros: " + contadorCero);
			
			// Cerramos el Scanner
			reader.close();
		}
}
