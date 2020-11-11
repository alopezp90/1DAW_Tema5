package arrays;

import java.util.Scanner;

/**
 *
 * @author albertolopez
 */
public class Ej02 {

    public static void main(String[] args) {
        int cantidad, contador = 0, media = 0;
        int[] altura;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce cantidad de personas.");
            cantidad = sc.nextInt();
        } while (cantidad <= 0);

        altura = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce altura (cm) de la persona " + (i+1));
            altura[i] = sc.nextInt();
            if (altura[i]<0){
                altura[i]*=-1;
            }
            media+=altura[i];
        }
        
        media /= cantidad;
        for (int i = 0; i < cantidad; i++){
            if (altura[i]>=media){
                contador++;
            }
        }
        System.out.println("La media de altura es de "+media+" cm.");
        System.out.println("Hay "+contador+" personas mayor o igual y "+(cantidad-contador)+" personas menores que la media.");
    }
}
