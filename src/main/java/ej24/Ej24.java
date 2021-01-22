package ej24;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Ej24 {

    private static Random rd = new Random();

    private static ArrayList<Integer> lista1 = new ArrayList<Integer>();
    private static ArrayList<Integer> lista2 = new ArrayList<Integer>();
    private static ArrayList<Integer> lista3 = new ArrayList<Integer>();
    private static ArrayList<Integer> lista4 = new ArrayList<Integer>();

    public static void main(String[] args) {
        //rellena lista1
        int n = rd.nextInt(11) + 5;
        for (int i = 0; i < n; i++) {
            lista1.add(rd.nextInt(51) + 50);
        }
        //rellena lista2
        n = rd.nextInt(11) + 10;
        for (int i = 0; i < n; i++) {
            lista2.add(rd.nextInt(51) + 50);
        }

        //imprime listas 1 y 2
        for (Integer elemento : lista1) {
            System.out.print(elemento + " ");
        }
        System.out.println("");
        for (Integer elemento : lista2) {
            System.out.print(elemento + " ");
        }
        System.out.println("\n------------------");

        //crea e imprime lista 3
        for (Integer elemento : lista1) {
            if (!lista2.contains(elemento)) {
                lista3.add(elemento);
            }
        }
        for (Integer elemento : lista3) {
            System.out.print(elemento + " ");
        }
        System.out.println("\n------------------");
        
        //crea e imprime lista 4
        for (Integer elemento : lista1) {
            if (elemento % 2 == 0) {
                lista4.add(elemento);
            }
        }
        for (Integer elemento : lista2) {
            if (elemento % 2 != 0) {
                lista4.add(elemento);
            }
        }
        lista4.forEach(elemento -> {
            System.out.print(elemento + " ");
        });
        System.out.println("\n------------------");
    }
}
