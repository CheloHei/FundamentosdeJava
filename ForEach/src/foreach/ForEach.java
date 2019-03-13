/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreach;

/**
 *
 * @author Chelo
 */
public class ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona[] persona= {new Persona("Juan"),new Persona("juana")};
        
        //iteramos cada elemento del arreglo de personas
        
        for (Persona persona1 : persona) {
            //Accedemos las propiedades de los metodos
            String nombre = persona1.getNombre();
            System.out.println("Nombre es "+ nombre);
        }
        System.out.println("");
        //Creamos un arreglo de enteros
        int[] edades = {15,20,15,10};
        for (int edad : edades) {
            System.out.println("edad"+ edad);
        }
    }
    
}
