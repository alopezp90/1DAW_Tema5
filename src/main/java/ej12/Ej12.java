package ej12;

import java.util.Scanner;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Ej12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] matriz = new char[2][3];

        System.out.println("Introduce los 6 chars 1 a 1:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.next().charAt(0);
            }
        }

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
