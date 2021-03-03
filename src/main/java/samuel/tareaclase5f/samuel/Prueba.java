/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuel.tareaclase5f.samuel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<CuadradoMagico> cuadrados = new ArrayList<CuadradoMagico>();
        Scanner escaner = new Scanner(System.in);
        CuadradoMagico cuadrado1 = new CuadradoMagico();
        CuadradoMagico cuadrado2 = new CuadradoMagico();
        CuadradoMagico cuadrado3 = new CuadradoMagico();
        CuadradoMagico cuadrado4 = new CuadradoMagico();
        CuadradoMagico cuadrado5 = new CuadradoMagico();
        CuadradoMagico cuadrado6 = new CuadradoMagico();
        CuadradoMagico cuadrado7 = new CuadradoMagico();
        CuadradoMagico cuadrado8 = new CuadradoMagico();
        CuadradoMagico cuadrado9 = new CuadradoMagico();
        CuadradoMagico cuadrado10 = new CuadradoMagico();
        CuadradoMagico cuadrado11 = new CuadradoMagico();
        CuadradoMagico cuadrado12 = new CuadradoMagico();
        CuadradoMagico cuadrado13 = new CuadradoMagico();
        CuadradoMagico cuadrado14 = new CuadradoMagico();
        CuadradoMagico cuadrado15 = new CuadradoMagico();
        cuadrados.add(cuadrado1);
        cuadrados.add(cuadrado2);
        cuadrados.add(cuadrado3);
        cuadrados.add(cuadrado4);
        cuadrados.add(cuadrado5);
        cuadrados.add(cuadrado6);
        cuadrados.add(cuadrado7);
        cuadrados.add(cuadrado8);
        cuadrados.add(cuadrado9);
        cuadrados.add(cuadrado10);
        cuadrados.add(cuadrado11);
        cuadrados.add(cuadrado12);
        cuadrados.add(cuadrado13);
        cuadrados.add(cuadrado14);
        cuadrados.add(cuadrado15);
        System.out.println("¿Qué columna le gustaría que se comprobase?");
        int columna = escaner.nextInt();
        System.out.println("¿Qué fila le gustaría que se comprobase?");
        int fila = escaner.nextInt();
        for (CuadradoMagico cuadrado : cuadrados) {
            if (cuadrado.esCuadradoMagico(fila, columna)) {
                System.out.println("El cuadrado " + cuadrado + " es un cuadrado mágico");
            } else {
                System.out.println("El cuadrado " + cuadrado + " no es un cuadrado mágico");
            }
        }

    }

}
