/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoboxunbox;

/**
 *
 * @author Chelo
 */
public class AutoBoxUnBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Autoboxing (se convierten de tipos primitivos a tipos Obj)
        Integer enteroObj = 10;
        Float flotanteObj = 15.2F;
        Double dobleObj = 40.1;
        System.out.println("AutoBoxing");
        System.out.println("Entero Obj" + enteroObj.intValue());
        System.out.println("Flotante Obj" + flotanteObj.floatValue());
        System.out.println("Double Obj" + dobleObj.doubleValue());
        
        
        //Autounboxing (se convierten de objetos atipos primitivos)
        int entero = enteroObj;
        double doble = dobleObj;
        float flotante = flotanteObj;
        System.out.println("\nUnboxing");
        System.out.println("Entero "+entero);
        System.out.println("Flotante "+doble);
        System.out.println("Double "+flotante);
        
    }
    
}
