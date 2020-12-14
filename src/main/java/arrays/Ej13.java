package arrays;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
import java.util.Scanner;

public class Ej13 {

    public static void main(String[] args) {

        int[] histograma = new int[20];
        Scanner sc = new Scanner(System.in);
        int entrada;
        
        do {
            do {
                entrada = sc.nextInt();
            } while (entrada < 0 || entrada > 20);
            if (entrada != 0) {
                histograma[entrada - 1]++;
            }
        } while (entrada != 0);

        for (int i = 0; i < 20; i++) {
            System.out.print((i + 1) + ": ");
            String salida = "";
            for(int j = 0; j<histograma[i]; j++){
                salida = salida + "*";
            }
            System.out.print(salida + "\n");
        }
    }
}
