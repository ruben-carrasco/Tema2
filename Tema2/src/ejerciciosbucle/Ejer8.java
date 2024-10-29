package ejerciciosbucle;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		// Declaramos la variable que recoge el numero introducido por el usuario
		int n;
		// Variable que recoge que el numero introducido para comprobar en la siguiente iteracion
		int comprobador  = 0;
		// Contador de fallos
		int fallos = 0;
		// Contador de numeros introducidos
		int contador = 1;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos el numero al usuario y lo guardamos en la variable
		System.out.println("Introduzca un numero inicial: ");
		n = reader.nextInt();
		
		// Creamos un bucle do-while para hacer comprobaciones hasta introducir 0;
		do {
			// Si el numero introducido es menor que el anterior imprime error
			if (n < comprobador) {
				System.out.println("Fallo. El numero es menor");
				// Aumentamos en 1 el contador de falos
				fallos++;
				// Inicializamos a 0 para reiniciar la  variable
				n = 0;
			}
			
			// Para no sobreescribir n, asignamos a otra variable el valor de n
			comprobador = n;
			
			// Volvemos a pedir un numero
			System.out.println("Introduzca un numero: ");
			n = reader.nextInt();
			
			contador++;
			
		} while (n != 0);
		
		// Mostramos los resultados
		System.out.println("Numeros fallados: " + fallos);
		System.out.println("Numeros introducidos: " + contador);
		
		// Cerramos el Scanner
		reader.close();
		
	}

}