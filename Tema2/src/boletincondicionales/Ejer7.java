package boletincondicionales;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {

		// Variable que recoge los dias de estancia
		int dias;
		// Variable que recoge la distancia recorrida
		double km;
		// Variable para el precio sin descuento
		double precio;
		// Variable para el precio final
		double precioFinal;
		// Constante que guarda el precio pro km
		final double PRECIO_KM = 2.5;
		// Constante para el descuento
		final double DESCUENTO = 0.70;

		// Creamos el escaner
		Scanner reader = new Scanner(System.in);

		// Pedimos al usuario el número de días y lo guardamos
		System.out.println("Introduzca los dias: ");
		dias = reader.nextInt();

		// Pedimos al usuario el número de kilometros y lo guardamos
		System.out.println("Introduzca los kilometros: ");
		km = reader.nextDouble();

		// Calculamos el precio sin descuento
		precio = km * PRECIO_KM;

		// Creamos el if para calcular el descuento si cumple la condición
		if (dias > 7 && km > 800) {
			precioFinal = precio * DESCUENTO;
		} else {
			precioFinal = precio;
		}

		// Mostramos el precio final
		System.out.println("El precio de su billete es de " + precioFinal + " €");

		// Cerramos el escaner
		reader.close();
	}

}