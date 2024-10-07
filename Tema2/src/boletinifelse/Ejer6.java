package boletinifelse;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		// Variables que recogen los coheficientes a, b, c
		double a;
		double b;
		double c;
		// Variables que recogen los resultados
		double x1;
		double x2;
		double resultadoFinal;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		//Pedimos el coheficiente a al usuario
		System.out.println("Introduzca el coheficiente a: ");
		a = reader.nextDouble();
		
		//Pedimos el coheficiente b al usuario
		System.out.println("Introduzca el coheficiente b: ");
		b = reader.nextDouble();
		
		//Pedimos el coheficiente c al usuario
		System.out.println("Introduzca el coheficiente c: ");
		c = reader.nextDouble();
		
		// Con if calculamos si tiene o no solucion y si la tiene cuales son.
		if ( ((b * b) - (4 * a * c)) < 0 ) {
			System.out.println("No tiene soluciones.");
		}
		else {
			x1 = ((-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
			x2 = ((-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
			System.out.println("Soluciones: x = " + x1 + " y x = " + x2);
		}
		
		// Cerramos el Scanner
		reader.close();

	}
}