/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoreferencia;

/**
 *
 * @author Chelo
 */
public class PasoReferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona();
        p.colocarNombre("Marce");
        imprimirNombre(p);
        modificarPersona(p);
        imprimirNombre(p);

    }
    public static void modificarPersona(Persona arg){
        arg.colocarNombre("Jonas");
    }
    public static void imprimirNombre(Persona p){
        System.out.println("Valor recibido es: " + p.obtener());
    }
    
    

}
