package boletincondicionales;

import java.util.Scanner;

// Pruebas

public class Ejer1 {
    public static void main(String[] args) {
    	
    	// Declaramos la variable del numero introducido por el usuario
        int num;
        // Declaramos la variables para cada cifra
        int mil;
        int cent;
        int dec;
        int uni;
        // Declaramos la variable que recoge el numero de digitos
        int digitos;
    
        // Creamos el Scanner
        Scanner reader = new Scanner(System.in);

        // Pedimos y guardamos en la variable el numero
        System.out.println("Introduce un número entre 0 y 9999: ");
        num = reader.nextInt();

        // Comprobación del rango
        if (num < 0 || num > 9999) {
            System.out.println("El valor introducido no esta entre 0 y 9999.");
        } else {
            // Calculamos las cifras
            mil = num / 1000;
            cent = (num / 100) % 10;
            dec = (num / 10) % 10;
            uni = num % 10;

            // Determinamos el número de dígitos
            if (num < 10) {
                digitos = 1;
            } else if (num < 100) {
                digitos = 2;
            } else if (num < 1000) {
                digitos = 3;
            } else {
                digitos = 4;
            }

            // Usamos switch según el número de dígitos para comprobar si es o no capicua
            switch (digitos) {
                case 1 ->
                    System.out.println("El número es capicua");
                case 2 -> {
                    if (dec == uni) {
                        System.out.println("El número es capicúa");
                    } else {
                        System.out.println("El número no es capicúa");
                    }
                }
                case 3 -> {
                    if (cent == uni) {
                        System.out.println("El número es capicua");
                    } else {
                        System.out.println("El número no es capicúa");
                    }
                }
                case 4 -> {
                    if (mil == uni && cent == dec) {
                        System.out.println("El número es capicúa");
                    } else {
                        System.out.println("El número no es capicúa");
                    }
                }
                default ->
                    System.out.println("Error");
            }
        }
        
        // Cerramos el Scanner
        reader.close();
    }
}