package ej26;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Prueba {

    public static void main(String[] args) {
        
        PilaLIFO pila = new PilaLIFO(20);
        
        char[] arrayTest = new char[] {'a','b','c','d','e','f','g','h','i','j','k'};
        
        //rellena la pila con un array de 11 char y la muestra 
        pila.rellenar(arrayTest);
        pila.mostrarElementos();
        System.out.println("---------------");
        
        //imprime numero maximo de elementos (deberia ser el numero de elementos en el array)
        System.out.println(pila.numeroElementos());
        System.out.println("---------------");
        
        //quita un elemento de la pila (y lo muestra, luego la imprime)
        System.out.println(pila.pop());
        System.out.println("---------------");
        pila.mostrarElementos();
        System.out.println("---------------");
        
        //añade un elemento a la pila y la muestra
        pila.push('z');
        pila.mostrarElementos();
        System.out.println("---------------");
        
        //guarda el contenido de la pila en un array, la vacia y muestra el array
        char[] aux = pila.sacarElementos();
        System.out.println(aux);
    }
}
