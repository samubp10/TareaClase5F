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
        //Los objetos de tipo CuadradoMagico
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
        //Meto los objetos en el array list
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

        int i = 1;
        //Recorro el arraylist ejecutanto el método esCuadradoMagico para saber 
        //si ese cuadrado es un cuadrado mágico o no
        for (CuadradoMagico cuadrado : cuadrados) {

            if (cuadrado.esCuadradoMagico()) {
                System.out.println("==================");
                cuadrado.imprimirMatriz();
                System.out.println("El cuadrado cuadrado" + i + " es un cuadrado mágico");
                i++;

            } else {
                System.out.println("==================");
                cuadrado.imprimirMatriz();
                System.out.println("El cuadrado cuadrado" + i + " no es un cuadrado mágico");
                i++;

            }

        }

    }

}
