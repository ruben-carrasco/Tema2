package ejerciciosanterior;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class PracticaExamen {
	public static void main(String[] args) {

		// Creamos la variable que recoga el numero introducido por el usuario
		int num = 0;
		// Variable para recoger la opcion del menu
		String opcion;
		// Variable booleano de error para el loop del try catch
		boolean error = false;
		// Variable para almacenar un numero random
		int numrand;
		// Booleano para salir del bucle cuando se encuentre el mcm o mcd
		boolean enc = false;
		// Variable para almacenar los multiplos
		int multiplo = 0;
		// Variable para almacenar los divisores
		int divisor;
		// Variable del numero reverso
		int reverso = 0;
		// Variable del numero original
		int original;
		// VAriable del digito
		int digito;
		// VAriable para contar digitos
		int contador = 0;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		// Creamos el Random
		Random rand = new Random();

		do {
			try {
				// Pedimos al usuario el numero y lo guardamos en la variable
				System.out.println("Introduzca un numero: ");
				num = reader.nextInt();
				assert num > 0 : "Introduzca un numero mayor que cero";
				error = false;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());
				error = true;
			} catch (InputMismatchException e) {
				System.out.println("El numero no es entero");
				error = true;
			} finally {
				reader.nextLine();
			}
		} while (error);

		// Creamos el menu
		System.out.println("A: Calcular el minimo comun multiplo de el numero y otro aleatorio");
		System.out.println("B: Calcular el maximo comun dividor de el numero y otro aleatorio");
		System.out.println("C: Comprobar si es capicua");
		System.out.println("D: Contar el numero de digitos");
		System.out.println("E: Salir");

		// Pedimos al numero una opcion y la guardamos en la variable
		System.out.println("Introduca una opcion: ");
		opcion = reader.next();

		// Guardamos un numero random en la variable random
		numrand = rand.nextInt(1, 101);

		// Creamos el Switch con las distintas opciones del menu
		switch (opcion) {
		// Caso para el minimo comun multiplo
		case "A" -> {
			multiplo = Math.max(numrand, num);
			System.out.println("El numero random es: " + numrand);
			while (!enc) {
				if (multiplo % num == 0 && multiplo % numrand == 0) {
					System.out.println("El mcm de " + num + " y " + numrand + " es " + multiplo);
					enc = true;
				}
				multiplo++;

			}

		}
		// Caso para el maximo comun divisor
		case "B" -> {
			divisor = Math.min(numrand, num);
			System.out.println("El numero random es: " + numrand);
			while (!enc) {
				if (num % divisor == 0 && numrand % divisor == 0) {
					System.out.println("El mcd de " + num + " y " + numrand + " es " + divisor);
					enc = true;
				}
				divisor--;

			}
		}
		// Caso para comprobar si es capicua
		case "C" -> {
			original = num;
			while (num != 0) {
				digito = num % 10;
				reverso = reverso * 10 + digito;
				num /= 10;
			}
			System.out.println(original == reverso ? "El numero es capicua" : "El numero no es capicua");
		}
		// Caso para contar digitos
		case "D" -> {
			while (num != 0) {
				num /= 10;
				contador++;
			}
			System.out.println("El numero de digitos es " + contador);

		}
		// Salir
		default -> {
			System.out.println("Saliendo...");
		}

		}

		// Cerramos el Scanner
		reader.close();
	}

}
