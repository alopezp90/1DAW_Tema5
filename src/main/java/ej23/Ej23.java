package ej23;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Ej23 {

    private ArrayList<Integer> lista;
    private static Random rd = new Random();

    public void generarLista(int n) {
        for (int i = 0; i < n; i++) {
            lista.add(rd.nextInt(91) + 10);
        }
    }

    public void imprimeLista() {
        System.out.println("--------------");
        lista.forEach(System.out::println);
    }

    public void sumaPares() {
        int acumulador = 0;
        System.out.println("------Suma Pares--------");
        for (Integer elemento : lista) {
            if (elemento % 2 == 0) {
                acumulador += elemento;
            }
        }
        System.out.println(acumulador);
    }

    public void cuentaImpares() {
        int contador = 0;
        System.out.println("-------Cuenta Impares-------");
        for (Integer elemento : lista) {
            if (elemento % 2 != 0) {
                contador++;
            }
        }
        System.out.println(contador);
    }

    public Integer mayor() {
        int mayor = 0;
        for (Integer elemento : lista) {
            if (elemento > mayor) {
                mayor = elemento;
            }
        }
        return mayor;
    }

    public Integer menor() {
        int menor = 101;
        for (Integer elemento : lista) {
            if (elemento < menor) {
                menor = elemento;
            }
        }
        return menor;
    }

    public int tamanioLista() {
        return lista.size();
    }

    public void borra(int n) {
        if (n >= 0 && n < lista.size()) {
            lista.remove(n);
        }
    }

    public void borraValor(Integer valor) {
        for (Integer elemento : lista) {
            if (elemento.equals(valor)) {
                lista.remove(lista.indexOf(elemento));
            }
        }
    }
    
    public void modifica(int posicion, Integer nuevoValor) {
        lista.set(posicion, nuevoValor);
    }
}
