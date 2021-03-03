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

    public CuadradoMagico(int[][] cuadradoMagico) {
        this.cuadradoMagico = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < cuadradoMagico.length;) {
            for (int j = 0; j < cuadradoMagico[i].length; j++) {

                int enteroAleatorio = random.nextInt(100) + 1;
            }
        }

    }

}
