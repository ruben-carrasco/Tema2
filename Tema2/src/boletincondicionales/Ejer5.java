package boletincondicionales;

import java.util.Scanner;
import java.util.Random;

// Pruebas

public class Ejer5 {
    public static void main(String[] args) {
    	
    	// Declaramo la variable para al respuesta del usuario
    	int numusu;
    	
    	// Declaramos las variables para los numeros 1 y 2
    	int num1;
    	int num2;
    	
    	// Declaramos la variable para la suma
    	int suma;
    	
    	// Creamos el Scanner
        Scanner reader = new Scanner(System.in);
        
        // Creamos el Ramdom
        Random random = new Random();
    
        // Guardamos los numeros aleatoriso en las variables
        num1 = random.nextInt(99) + 1;
        num2 = random.nextInt(99) + 1;
        
        // Pedimos y guardamos en la variable la respuesta del usuario
        System.out.println("¿Cuánto es " + num1 + " + " + num2 + "?");
        numusu = reader.nextInt();
        
        // Comprobamos el resultado de la suma
        suma = num1 + num2;
        
        // Con if comprobamos si es correcto
        if (numusu == suma) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto, la respuesta correcta es: " + suma);
        }
        
        // Cerramos el Scanner
        reader.close();
    }
}
