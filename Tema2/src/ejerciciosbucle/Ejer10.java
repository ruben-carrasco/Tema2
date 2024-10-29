package ejerciciosbucle;

import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
		// Declaramos la variable que recoge el numero introducido por el usuario
		int n;
		// Variable para almacenar el numero original
		int original;
		// Variable para almacenar el numero reverso
		int reverso = 0;
		// Variable para almacenar el digito
		int digito;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos un bucle do-while para pedir el numero de nuevo si es erroneo
		do {
			// Pedimos el numero al usuario y lo guardamos en la variable
			System.out.println("Introduzca un numero: ");
			n = reader.nextInt();
		} while (n < 0);

		/**
		 * Asignamos el numero a la variable original ya que trabajaremos con n y
		 * queremos guardar su valor antes de tocarla
		 **/
		original = n;

		// Creamos un bucle while para invertir el numero original
		while (n != 0) {
			// Sacamos el ultimo digito de n en cada iteracion
			digito = n % 10;
			// Al numero en reverso lo multiplicamos por 10 para anadir una cifra y le sumamos el digito obtenido
			reverso = reverso * 10 + digito;
			// Quitamos el ultimo digito de n para poder sacar la proxima cifra
			n /= 10;
		}
		
		System.out.println(original == reverso ? "El numero es capicua.": "El numero no es capicua");

		// Cerramos el Scanner
		reader.close();
	}

}