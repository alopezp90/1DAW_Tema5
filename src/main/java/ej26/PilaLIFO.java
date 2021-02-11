package ej26;

import java.util.ArrayList;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class PilaLIFO {

    private ArrayList<Character> pila;
    private int maximoElementos;

    public PilaLIFO(int n) {
        this.pila = new ArrayList();
        this.maximoElementos = n;
    }

    public int getMaximoElementos() {
        return maximoElementos;
    }

    public void setMaximoElementos(int maximoElementos) {
        this.maximoElementos = maximoElementos;
    }

    public ArrayList<Character> getPila() {
        return pila;
    }

    public void push(Character ch) {
        if (this.pila.size() < this.maximoElementos) {
            this.pila.add(ch);
        }
    }

    public Character pop() {
        return this.pila.remove(this.pila.size() - 1);
    }

    public boolean isEmpty() {
        return this.pila.isEmpty();
    }

    public boolean isFull() {
        return this.pila.size() == this.maximoElementos;
    }

    public int numeroElementos() {
        return this.pila.size();
    }

    public void mostrarElementos() {
        for (Character ch : this.pila) {
            System.out.println(ch);
        }
    }

    public void rellenar(char[] array) {
        this.maximoElementos = array.length;
        for (char ch : array) {
            this.pila.add(ch);
        }
    }

    public char[] sacarElementos() {
        char[] array = new char[this.pila.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = this.pop();
        }
        return array;
    }
}
