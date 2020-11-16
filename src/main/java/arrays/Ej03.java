package arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Ej03 {

    public static void main(String[] args) {
        double[] vector = new double[20];
        double[] vectorCopia;

        Random random = new Random();

        Arrays.fill(vector, 7.5);
        vectorCopia = Arrays.copyOf(vector, 20);
        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(vectorCopia));

        if (Arrays.equals(vector, vectorCopia)) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays no son iguales");
        }

        vector[random.nextInt(20)] = 6.3;
        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(vectorCopia));

        if (Arrays.equals(vector, vectorCopia)) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays no son iguales");
        }
    }
}
