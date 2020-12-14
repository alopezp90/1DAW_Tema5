package ej15;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
import java.util.Random;

public class LanzarMoneda {

    private boolean[] moneda;
    private int lanzamientos;

    public LanzarMoneda(int lanzamientos) {
        this.lanzamientos = lanzamientos;
        this.moneda = new boolean[lanzamientos];
    }

    public static boolean lanzar() {
        Random rd = new Random();
        return rd.nextBoolean();
    }

    public void llenarArray() {
        for (int i = 0; i < moneda.length; i++) {
            this.moneda[i] = lanzar();
        }
    }

    public int caras() {
        int contador = 0;
        for (int i = 0; i < moneda.length; i++) {
            if (this.moneda[i]) {
                contador++;
            }
        }
        return contador;
    }

    public int cruces() {
        int contador = 0;
        for (int i = 0; i < moneda.length; i++) {
            if (!this.moneda[i]) {
                contador++;
            }
        }
        return contador;
    }

    public void imprimir() {
        System.out.println("");
        for (int i = 0; i < moneda.length; i++) {
            System.out.print("Lanzamiento " + (i+1) + ": ");
            if (this.moneda[i]){
                System.out.println("cara");
            } else {
                System.out.println("cruz");
            }
        }
    }
}
