package boletincondicionales;

import java.util.Scanner;

// Pruebas

public class Ejer3 {
    public static void main(String[] args) {
    	
    	// Declaramos la variable que recoge el dni
    	int dni;
    	
    	// La que recoge el calculo del modulo 23
    	int mod;
    	
    	// La que recoge la letra final
    	char letra = ' ';
    	
    	// Creamos el Scanner
        Scanner reader = new Scanner(System.in);

        // Pedimos el dni y lo guardamos en la variable
        System.out.println("Introduce tu número de DNI sin la letra: ");
        dni = reader.nextInt();

        // Con if comprobamos el rango y si es valido hacemos el modulo
        if (dni < 0 || dni > 99999999) {
            System.out.println("El valor introducido es erróneo.");
        } else {
            mod = dni % 23;
            
            // Usamos switch para determinar la letra del DNI
            switch (mod) {
                case 0 -> letra = 'T';
                case 1 -> letra = 'R';
                case 2 -> letra = 'W';
                case 3 -> letra = 'A'; 
                case 4 -> letra = 'G'; 
                case 5 -> letra = 'M'; 
                case 6 -> letra = 'Y'; 
                case 7 -> letra = 'F'; 
                case 8 -> letra = 'P'; 
                case 9 -> letra = 'D'; 
                case 10 -> letra = 'X'; 
                case 11 -> letra = 'B'; 
                case 12 -> letra = 'N'; 
                case 13 -> letra = 'J'; 
                case 14 -> letra = 'Z'; 
                case 15 -> letra = 'S'; 
                case 16 -> letra = 'Q'; 
                case 17 -> letra = 'V';
                case 18 -> letra = 'H';
                case 19 -> letra = 'L'; 
                case 20 -> letra = 'C'; 
                case 21 -> letra = 'K'; 
                case 22 -> letra = 'E';
            }
            
            // Mostramos el resultado final
            System.out.println("La letra de tu DNI es: " + letra);
        }
        
        // Cerramos el Scanner
        reader.close();
    }
}
