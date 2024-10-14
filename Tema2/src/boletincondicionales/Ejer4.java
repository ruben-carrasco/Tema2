package boletincondicionales;

import java.util.Scanner;

// Pruebas

public class Ejer4 {
    public static void main(String[] args) {
    	// Declaramos la variable que recoge el numero introducido por el usuario
    	int numero;
    	
    	// Creamos las variables de las cifras en numerico
    	int uni;
    	int dec;
    	
    	// Creamos las variables de las cifras en formato letras
    	String unidad;
    	String decena;
    	
    	
    	// Creamos el Scanner
        Scanner reader = new Scanner(System.in);

        // Pedimos y guardamos el numero introducido por el usuario en una variable
        System.out.print("Introduce un número entre 1 y 99: ");
        numero = reader.nextInt();
        
        // Con if comprobamso que este en el rango y si es asi con switch pasamos de numero a formato letras
        if (numero < 1 || numero > 99) {
            System.out.println("El valor introducido es erróneo.");
        } else {
            switch (numero) {
                case 10: System.out.println("diez"); break;
                case 11: System.out.println("once"); break;
                case 12: System.out.println("doce"); break;
                case 13: System.out.println("trece"); break;
                case 14: System.out.println("catorce"); break;
                case 15: System.out.println("quince"); break;
                case 16: System.out.println("dieciséis"); break;
                case 17: System.out.println("diecisiete"); break;
                case 18: System.out.println("dieciocho"); break;
                case 19: System.out.println("diecinueve"); break;
                default: 
                    dec = numero / 10;
                    uni = numero % 10;
                    decena = "";
                    unidad = "";

                    switch (dec) {
                        case 2: decena = "veinte"; break;
                        case 3: decena = "treinta"; break;
                        case 4: decena = "cuarenta"; break;
                        case 5: decena = "cincuenta"; break;
                        case 6: decena = "sesenta"; break;
                        case 7: decena = "setenta"; break;
                        case 8: decena = "ochenta"; break;
                        case 9: decena = "noventa"; break;
                    }

                    switch (uni) {
                        case 1: unidad = "uno"; break;
                        case 2: unidad = "dos"; break;
                        case 3: unidad = "tres"; break;
                        case 4: unidad = "cuatro"; break;
                        case 5: unidad = "cinco"; break;
                        case 6: unidad = "seis"; break;
                        case 7: unidad = "siete"; break;
                        case 8: unidad = "ocho"; break;
                        case 9: unidad = "nueve"; break;
                    }

                    if (dec == 0) {
                        System.out.println(unidad);
                    } else {
                        System.out.println(decena + " y " + unidad);
                    }
            }
        }
        
        // Cerramos el Scanner
        reader.close();
    }
}
