package matrizcuadrada;

import java.util.Scanner;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class MatrizCuadrada {

    private static Scanner sc = new Scanner(System.in);
    private int[][] matriz;

    public MatrizCuadrada(int n) {
        this.matriz = new int[n][n];
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public void daValores() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public int[] buscaNumeroEspecial() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (this.compruebaFila(i, j)) {
                    if (this.compruebaColumna(i, j)) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[]{-1, -1};
    }

    //devuelve true si es el mayor de su fila
    public boolean compruebaFila(int i, int j) {
        for (int k = 0; k < this.matriz[0].length; k++) {
            if (this.matriz[i][k] > this.matriz[i][j]) {
                return false;
            }
        }
        return true;
    }

    //devuelve true si es el menor de su columna
    public boolean compruebaColumna(int i, int j) {
        for (int k = 0; k < this.matriz[0].length; k++) {
            if (this.matriz[k][j] < this.matriz[i][j]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String txt = "";
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[i].length; j++) {
                txt = txt + matriz[i][j] + "\t";
            }
            txt = txt + "\n";
        }
        return txt;
    }
    
    public static void main(String[] args) {
        MatrizCuadrada matriz = new MatrizCuadrada(3);
        matriz.daValores();
        System.out.println(matriz.toString());
        
        int[] coordenadas = matriz.buscaNumeroEspecial();
        
        System.out.println("posicion del numero 'especial' (" + coordenadas[0] + "," + coordenadas[1] + ")");
    }
}
