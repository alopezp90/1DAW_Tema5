package arrays;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Ej07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Introduce el tamaño de los arrays:");
        int tamanio = sc.nextInt();
        int[] array1 = new int[tamanio];
        int[] array2 = new int[tamanio];

        for (int i = 0; i < tamanio; i++) {
            array1[i] = rd.nextInt(100) + 1;
            array2[i] = rd.nextInt(100) + 1;
        }

        System.out.println("Los arrays son:");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int[] producto = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            producto[i] = array1[i] * array2[i];
        }
        System.out.println("El producto de ambos es:");
        System.out.println(Arrays.toString(producto));
    }
}
