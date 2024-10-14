package boletincondicionales;

import java.util.Scanner;

// Pruebas

public class Ejer2 {
    public static void main(String[] args) {
    	
    	// Declaramos las variable que recoge el numero y que recoge el valor absoluto
    	int num;
    	int valorabs;
    	
    	// Creamos el Scanner
        Scanner reader = new Scanner(System.in);
        
        // Pedimos al usuario un numero y lo guardamos en la variable
        System.out.println("Introduce un número: ");
        num = reader.nextInt();
        
        // Calculamos el valor absoluto
        valorabs = num < 0 ? -num : num;
        
        // Mostramos el valor absoluto
        System.out.println("El valor absoluto es: " + valorabs);
        
        // Cerramos el Scanner
        reader.close();
    }
}
