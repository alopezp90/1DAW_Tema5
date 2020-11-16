package arrays;

import java.util.Arrays;

/**
 *
 * @author albertolopez
 */
public class Ej01 {

    public static void main(String[] args) {

        int[] ARRAY = {1, 2, 3, 4, 5, 6};
        int suma = 0;

        for (int i = 0; i < ARRAY.length; i++) {
            suma += ARRAY[i];
        }
        System.out.println("El array es: " + Arrays.toString(ARRAY));
        System.out.println("La suma es: " + suma);
    }
}
