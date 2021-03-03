/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuel.tareaclase5f.samuel;

import java.util.Random;

/**
 *
 * @author Samuel
 */
public class CuadradoMagico {

    private int[][] cuadradoMagico;

    public CuadradoMagico() {
        this.cuadradoMagico = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < cuadradoMagico.length; i++) {
            for (int j = 0; j < cuadradoMagico[i].length; j++) {

                int enteroAleatorio = random.nextInt(100) + 1;
                cuadradoMagico[i][j] = enteroAleatorio;
            }
        }

    }

    public int sumarFila(int fila) {
        int resultado = 0;
        if (fila >= cuadradoMagico[0].length || fila < 0) {
            return 0;
        }
        for (int i = 0; i < cuadradoMagico[0].length; i++) {
            resultado += cuadradoMagico[fila][i];
        }
        return resultado;
    }

    public int sumarColumna(int columna) {
        int resultado = 0;
        if (columna >= cuadradoMagico[0].length || columna < 0) {
            return 0;
        }
        for (int i = 0; i < cuadradoMagico.length; i++) {
            resultado += cuadradoMagico[i][columna];
        }
        return resultado;
    }

    public int sumarDiagonalPrincipal() {
        int[] diagonalPrincipal = new int[cuadradoMagico.length];
        int resultado = 0;
        for (int i = 0; i < cuadradoMagico.length; i++) {
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                if (i == j) {
                    diagonalPrincipal[i] = cuadradoMagico[i][j];
                    resultado += diagonalPrincipal[i];
                }

            }
        }
        return resultado;
    }

    public int sumarDiagonalSecundaria() {
        int[] diagonalSecundaria = new int[cuadradoMagico.length];
        int resultado = 0;
        for (int i = 0; i < cuadradoMagico.length; i++) {
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                if (i + j == cuadradoMagico.length - 1) {
                    diagonalSecundaria[i] = cuadradoMagico[i][j];
                    resultado += diagonalSecundaria[i];
                }
            }
        }
        return resultado;
    }

    public boolean esCuadradoMagico(int fila, int columna) {
        if (this.sumarFila(fila) == this.sumarColumna(columna)
                && this.sumarFila(fila) == this.sumarDiagonalPrincipal() && this.sumarFila(fila) == this.sumarDiagonalSecundaria()) {
            return true;
        }
        return false;
    }

    public void imprimirMatriz() {
        for (int i = 0; i < cuadradoMagico.length; i++) {
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                System.out.println(cuadradoMagico[i][j]);
            }
        }
    }

    @Override
    public String toString() {
        return "CuadradoMagico{" + "cuadradoMagico=" + cuadradoMagico + '}';
    }

    
    
}
