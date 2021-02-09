package ej20;

import java.util.Scanner;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Ej20 {

    public static Scanner sc = new Scanner(System.in);
    public static char[][] avion;

    public static void main(String[] args) {
        boolean salir = false;
        avion = new char[25][4];
        vaciarAvion();

        do {
            switch (menu()) {
                case 1:
                    reservar();
                    System.out.println("-------------------------");
                    break;
                case 2:
                    cancelarReserva();
                    System.out.println("-------------------------");
                    break;
                case 3:
                    verAvion();
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
            System.out.println("4- Salir del programa");
            System.out.println("-------------------------");
            eleccion = sc.nextInt();
        } while (eleccion < 1 || eleccion > 4);
        return eleccion;
    }

    public static void vaciarAvion() {
        for (int i = 0; i < avion.length; i++) {
            for (int j = 0; j < avion[i].length; j++) {
                avion[i][j] = '0';
            }
        }
    }

    public static void reservar() {
        int fila, columna;

        do {
            System.out.println("Indique fila(1-25)");
            fila = sc.nextInt();
        } while (fila < 1 || fila > 25);

        do {
            System.out.println("Indique columna(1-25)");
            columna = sc.nextInt();
        } while (columna < 1 || columna > 25);

        if (avion[fila - 1][columna - 1] != 'X') {
            avion[fila - 1][columna - 1] = 'X';
            System.out.println("Reserva realizada");
        } else {
            System.out.println("El asiento ya esta ocupado");
        }
    }

    public static void cancelarReserva() {
        int fila, columna;

        do {
            System.out.println("Indique fila(1-25)");
            fila = sc.nextInt();
        } while (fila < 1 || fila > 25);

        do {
            System.out.println("Indique columna(1-25)");
            columna = sc.nextInt();
        } while (columna < 1 || columna > 25);

        if (avion[fila - 1][columna - 1] == 'X') {
            avion[fila - 1][columna - 1] = '0';
            System.out.println("Reserva anulada");
        } else {
            System.out.println("El asiento estaba libre");
        }
    }

    public static void verAvion() {
        for (int i = 0; i < avion.length; i++) {
            for (int j = 0; j < avion[i].length; j++) {
                System.out.print(avion[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
