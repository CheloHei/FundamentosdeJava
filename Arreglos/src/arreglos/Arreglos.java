/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author Chelo
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edades[];
        edades = new int[3]; // instanciando tipo  y tamañao del array
        //Asignamos valor por posicion
        edades[0] = 30;
        edades[1] = 15;
        
        System.out.println("Indice 0 " + edades[0]);
        System.out.println("Indice 1 " + edades[1]);
        
        
        Persona personas[];
        personas = new Persona[4];
        
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karla");
        
        System.out.println("indice 0 " + personas[0]);
        System.out.println("indice 1 " + personas[1]);
        
        String[] nombres = {"sara","pesara","cansada","golosa"};
        
        System.out.println("");
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Arreglo String indice" + i + ": " + nombres[i]);
        }
    }
    
}
