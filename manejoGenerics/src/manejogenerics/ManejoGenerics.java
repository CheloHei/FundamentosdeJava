/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejogenerics;

/**
 *
 * @author Chelo
 */
public class ManejoGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica<Integer>(15);
        ClaseGenerica<String> objetoCadena = new ClaseGenerica<>("Prueba");
        objetoInt.obtenerTipo();
        objetoCadena.obtenerTipo();
    }
    
}
