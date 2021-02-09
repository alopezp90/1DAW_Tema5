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
        int[] coordenada = new int[2];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j].compruebaFila()){
                    if(matriz[i][j].compruebaColumna()) {
                        coordenada[0] = i;
                        coordenada[1] = j;
                        return coordenada;
                    }
                }
            }
        }
        return coordenada;
    }
}
