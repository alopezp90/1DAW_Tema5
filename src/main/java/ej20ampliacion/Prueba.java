package ej20ampliacion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Prueba {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Avion> aerolinea = new ArrayList();

    public static void main(String[] args) {
        boolean salir = false;

        do {
            switch (menu()) {
                case 1:
                    reservar();
                    System.out.println("-------------------------");
                    break;
                case 2:
                    cancelar();
                    System.out.println("-------------------------");
                    break;
                case 3:
                    imprimirAvion();
                    break;
                case 4:
                    creaAvion();
                    break;
                default:
                    salir = true;
            }
        } while (!salir);
    }
    
    public static int menu() {
        int eleccion;
        do {
            System.out.println("-------------------------");
            System.out.println("Indique qué desea hacer:");
            System.out.println("1- Reservar un asiento");
            System.out.println("2- Cancelar una reserva");
            System.out.println("3- Ver ocupacion");
            System.out.println("4- Compra avion");
            System.out.println("5- Salir del programa");
            System.out.println("-------------------------");
            eleccion = sc.nextInt();
        } while (eleccion < 1 || eleccion > 5);
        return eleccion;
    }

    public static int solicitaDato(int min, int max) {
        int eleccion;
        do {
            eleccion = sc.nextInt();
        } while (eleccion < min || eleccion > max);
        return eleccion;
    }

    public static void creaAvion() {
        System.out.println("Introduce numero de filas(1-60) y columnas(1-12)");
        aerolinea.add(new Avion(solicitaDato(1, 60), solicitaDato(1, 12)));
    }

    public static void reservar() {
        int avion, fila, columna;
        System.out.println("Selecciona numero avion (0-" + (aerolinea.size() - 1) + ")");
        avion = solicitaDato(0, aerolinea.size() - 1);
        System.out.println("Selecciona fila (1-"
                + aerolinea.get(avion).getReservas().length + ")");
        fila = solicitaDato(1, aerolinea.get(avion).getReservas().length) - 1;
        System.out.println("Selecciona columna (1-"
                + aerolinea.get(avion).getReservas()[0].length + ")");
        columna = solicitaDato(1, aerolinea.get(avion).getReservas()[0].length) - 1;
        
        aerolinea.get(avion).getReservas()[fila][columna] = true;
    }
    
    public static void cancelar() {
        int avion, fila, columna;
        System.out.println("Selecciona numero avion (0-" + aerolinea.size() + ")");
        avion = solicitaDato(0, aerolinea.size() - 1);
        System.out.println("Selecciona fila (1-"
                + aerolinea.get(avion).getReservas().length + ")");
        fila = solicitaDato(1, aerolinea.get(avion).getReservas().length) - 1;
        System.out.println("Selecciona columna (1-"
                + aerolinea.get(avion).getReservas()[0].length + ")");
        columna = solicitaDato(1, aerolinea.get(avion).getReservas()[0].length) - 1;
        
        aerolinea.get(avion).getReservas()[fila][columna] = false;
    }
    
    public static void imprimirAvion() {
        System.out.println("Selecciona numero avion (0-" + aerolinea.size() + ")");
        System.out.println(aerolinea.get(solicitaDato(0, aerolinea.size() - 1)).toString());
    }
}
