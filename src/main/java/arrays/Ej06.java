package arrays;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
import java.util.Arrays;
import java.util.Scanner;

public class Ej06 {

    //Hacer un programa que dados dos arrays determine si son iguales. 
    //Probarlo con los arrays [1,2,3] y [1,2,3], [1,2,3,4] y [1,2,3] , [1,2,3] 
    //y [1,2,2]. Este ejercicio hay que hacerlo de dos formas: la primera, 
    //usando la clase Arrays; la segunda, creando un método que vaya comparando 
    //los valores de los arrays y devuelva true si todos son iguales o false en 
    //caso contrario.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce número de elementos en el array1:");
        int[] array1 = new int[sc.nextInt()];
        System.out.println("Introduce número de elementos en el array2:");
        int[] array2 = new int[sc.nextInt()];

        System.out.println("Introduce elementos del array1:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Introduce elementos del array2:");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.nextInt();
        }

        System.out.println("Usando la clase Arrays:");
        if (Arrays.equals(array1, array2)) {
            System.out.println(Arrays.toString(array1) + " es igual a " + Arrays.toString(array2));
        } else {
            System.out.println(Arrays.toString(array1) + " no es igual a " + Arrays.toString(array2));
        }

        System.out.println("Elemento a elemento:");
        int limite;
        boolean iguales = true;
        if (array1.length >= array2.length) {
            limite = array1.length;
        } else {
            limite = array2.length;
        }
        try {
            for (int i = 0; i < limite; i++) {
                if (array1[i]!=array2[i]){
                    iguales = false;
                    break;
                }
            }

        } catch (IndexOutOfBoundsException e) {
            iguales = false;
        }

        System.out.println("¿Son los arrays iguales? " + iguales);

    }
}
