package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Ej04 {

    public static void main(String[] args) {

        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce valor (0-9)");
        int n = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                System.out.println(n + " se encuentra en la posicion " + i + " del array");
                break;
            }
        }
        int posicion = Arrays.binarySearch(array, n);
        System.out.println(n + " se encuentra en la posicion " + posicion + " del array");
    }
}
