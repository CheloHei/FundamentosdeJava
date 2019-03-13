/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomatrices;

import com.gm.domain.matrices.Persona;

/**
 *
 * @author Chelo
 */
public class EjemploMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edades[][];

        edades = new int[3][2];

        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 15;
        edades[2][0] = 5;
        edades[2][1] = 10;

        System.out.println("Matriz enteros" + edades[0][0]);
        System.out.println("Matriz enteros" + edades[0][1]);
        System.out.println("Matriz enteros" + edades[1][0]);
        System.out.println("Matriz enteros" + edades[1][1]);
        System.out.println("Matriz enteros" + edades[2][0]);
        System.out.println("Matriz enteros" + edades[2][1]);

        Persona personas[][] = new Persona[3][2];

        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Armando");
        personas[1][0] = new Persona("Rata");
        personas[1][1] = new Persona("Juana");
        personas[2][0] = new Persona("Julian");
        personas[2][1] = new Persona("Jupana");

        System.out.println("");
        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas[i].length; j++) {
                System.out.println("Personas indice: " + i + ":" + j + ":" + personas[i][j]);
            }

        }

        String nombres[][] = {{"terer", "paola", "romera"}, {"pedra", "raula", "esteban"}};
        System.out.println("");
        System.out.println("Largo en renglones" + nombres.length);
        System.out.println("Largo en columnas" + nombres[0].length);

        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.println("Nombres indice: " + i + ":" + j + ":" + nombres[i][j]);
            }

        }

    }

}
