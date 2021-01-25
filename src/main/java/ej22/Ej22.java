package ej22;

import java.util.Scanner;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */

public class Ej22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();
        
        String[] palabras = frase.split(" ");
        
        for(String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
