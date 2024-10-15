package boletinwhile;

import java.util.Scanner;

public class Ejer5 {

		public static void main(String[] args) {
			
			// Declaramos la variable que recoge las edades introducidas
			double edad;
			// Variable que recoge la suma de las Edades
			double sumaEdades = 0;
			// Variable que recoge el número de alumnos introducidos
			int numAlumnos = 0;
			// Variable que recoge la cantidad de alumnos mayores de edad
			int mayorEdad = 0;
			
			// Creamos el Scanner
			Scanner reader = new Scanner(System.in);
			
			// Pedimos la edad al usuario y lo guardamos en la variable
			System.out.println("Introduzca la primera edad: ");
			edad = reader.nextInt();
			
			// Vamos sumando con el while y detenemos cuando sea negativo
			while (edad > 0) {
					numAlumnos++;
					sumaEdades += edad;
					if (edad >= 18) {
						mayorEdad++;
					}
					
				System.out.println("Introduzca el siguiente edad: ");
				edad = reader.nextInt();
				
			}
			
			// Mostramos el resultado
			System.out.println("La suma de las edades es: " + sumaEdades);
			
			System.out.println("La media de las edades es: " + sumaEdades / numAlumnos);
			
			System.out.println("El número de alumnos es: " + numAlumnos);
			
			System.out.println("Los alumnos mayores de edad son: " + mayorEdad);
			
			// Cerramos el Scanner
			reader.close();
		}
}