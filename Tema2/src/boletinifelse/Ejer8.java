package boletinifelse;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		// Creamos la variable que recoja el número
		double numero;
		
		// Creamos Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos la nota al usuario
		System.out.println("Introduzca su nota: ");
		numero = reader.nextDouble();
		
		// Comprobamos que esté entre 0 y 10 y si es así comprobamos con que corresponde
		if (numero >= 0 && numero <= 10) {
			if (numero >= 0 && numero < 5) {
				System.out.println("Su nota es insuficiente.");
			}
			else if (numero >= 5 && numero < 6) {
				System.out.println("Su nota es suficiente.");
			}
			else if (numero >= 6 && numero < 7) {
				System.out.println("Su nota es bien.");
			}
			else if (numero >= 7 && numero < 9) {
				System.out.println("Su nota es notable.");
			}
			else  {
				System.out.println("Su nota es sobresaliente");
			}
		}
		else {
			System.out.println("La nota debe estar entre 0 y 10.");
		}
		
		// Cerramos el Scanner
		reader.close();

	}

}