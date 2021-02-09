package ej20ampliacion;

import static ej20.Ej20.avion;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Avion {
    
    private boolean[][] reservas;
    
    public Avion(int filas, int columnas) {
        reservas = new boolean[filas][columnas];
    }

    public boolean[][] getReservas() {
        return reservas;
    }

    public void setReservas(boolean[][] reservas) {
        this.reservas = reservas;
    }
    
    public void reservaAsiento(int fila, int columna) {
        this.getReservas()[fila][columna] = true;
    }
    
    public void cancelaReserva(int fila, int columna) {
        this.getReservas()[fila][columna] = false;
    }

    @Override
    public String toString() {
        String txt = "";
        for (int i = 0; i < reservas.length; i++) {
            for (int j = 0; j < reservas[i].length; j++) {
                if (reservas[i][j]) {
                    txt = txt + "X\t";
                } else {
                    txt = txt + "0\t";
                }
            }
            txt = txt + "\n";
        }
        return txt;
    }
    
    
}
