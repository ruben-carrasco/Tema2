package boletinfor;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		// Creamos la variable para recoger el número introducido por el usuario
		int num;
		
		// Variable que recoge el factorial
		long factorial;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el número al usuario y lo guardamos en la variable
		System.out.println("Introduzca el número del que desea conocer el factorial: ");
		num = reader.nextInt();
		
		// Inicializamos el factorial asignandole el valor de num
		factorial = num;
		
		// Creamos el for
		for (int i = num - 1; i >= 1 ; i--) {
			factorial *= i;
		}
		
		// Mostramos la suma en pantalla
		System.out.println(num + "! = " + factorial);

		// Cerramos el Scanner
		reader.close();
	}

}