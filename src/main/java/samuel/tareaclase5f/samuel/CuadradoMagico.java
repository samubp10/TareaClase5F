/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuel.tareaclase5f.samuel;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Samuel
 */
public class CuadradoMagico {

    private int[][] cuadradoMagico;
//Constructor

    public CuadradoMagico() {
        this.cuadradoMagico = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < cuadradoMagico.length; i++) {
            for (int j = 0; j < cuadradoMagico[i].length; j++) {

                int enteroAleatorio = random.nextInt(2) + 1;
                cuadradoMagico[i][j] = enteroAleatorio;
            }
        }

    }
//Recorre la fila introducida y suma sus valores

    public int sumarFila(int fila) {
        int resultado = 0;
        if (fila < cuadradoMagico.length && fila >= 0) {

            for (int i = 0; i < cuadradoMagico[0].length; i++) {
                return resultado += cuadradoMagico[fila][i];
            }
        }
        return 0;
    }
//Recorre la columna introducida por el usuario y la suma

    public int sumarColumna(int columna) {
        int resultado = 0;
        if (columna < cuadradoMagico.length && columna >= 0) {

            for (int i = 0; i < cuadradoMagico.length; i++) {
                return resultado += cuadradoMagico[i][columna];
            }
        }
        return 0;
    }
//Recorre la diagonal principal del array y la suma

    public int sumarDiagonalPrincipal() {
        int resultado = 0;
        for (int i = 0; i < cuadradoMagico.length; i++) {
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                if (i == j) {
                    resultado += cuadradoMagico[i][j];

                }

            }
        }
        return resultado;
    }
//Recorre la diagonal secundaria del array y la suma

    public int sumarDiagonalSecundaria() {
        int resultado = 0;
        for (int i = 0; i < cuadradoMagico.length; i++) {
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                if (i + j == cuadradoMagico.length - 1) {
                    resultado += cuadradoMagico[i][j];

                }
            }
        }
        return resultado;
    }
//Es un método booleano que devuelve true en el caso en el que sea un cuadrado mágico

    public boolean filaMagica() {
        int resultado = 0;
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<Boolean> Magicos = new ArrayList<Boolean>();
        for (int i = 0; i < cuadradoMagico.length; i++) {
            for (int j = 0; j < cuadradoMagico[i].length; j++) {
                resultado += cuadradoMagico[i][j];
            }
            numeros.add(resultado);
            resultado = 0;
        }
        for (Integer i : numeros) {
            for (Integer e : numeros) {
                if (i == e) {
                    Magicos.add(true);
                } else {
                    return false;
                }
            }
        }
        if (Magicos.contains(false)) {
            return false;
        }
        return true;
    }

    public boolean columnaMagica() {
        int resultado = 0;
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<Boolean> Magicos = new ArrayList<Boolean>();
        for (int i = 0; i < cuadradoMagico[0].length; i++) {
            for (int f = 0; f < cuadradoMagico[0].length; f++) {
                resultado += cuadradoMagico[f][i];
            }
            numeros.add(resultado);
            resultado = 0;
        }
        for (Integer i : numeros) {
            for (Integer e : numeros) {
                if (i == e) {
                    Magicos.add(true);
                } else {
                    return false;

                }
            }
        }
        if (Magicos.contains(false)) {
            return false;
        }
        return true;
    }

    public boolean esCuadradoMagico() {
        if (this.columnaMagica() && this.filaMagica()
                && this.sumarDiagonalPrincipal() == this.sumarDiagonalSecundaria()) {
            return true;
        }
        return false;
    }
//Recorre la matriz imprimiendo los valores

    public void imprimirMatriz() {
        for (int x = 0; x < cuadradoMagico.length; x++) {
            for (int y = 0; y < cuadradoMagico[x].length; y++) {
                System.out.print(" | " + cuadradoMagico[x][y] + " | ");
            }
            System.out.println(" ");
        }
    }

}
