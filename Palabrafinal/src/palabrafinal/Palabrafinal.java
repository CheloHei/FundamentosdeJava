/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrafinal;

/**
 *
 * @author Chelo
 */
public class Palabrafinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        //ClaseFinal.primitivo = 15;
        //ClaseFinal.persona = new Persona();
        
        System.out.println("Nombre " + ClaseFinal.persona.getNombre());
        
        ClaseFinal.persona.setNombre("Otro");
        System.out.println("Nombre nuevo: " + ClaseFinal.persona.getNombre());
    }
    
}
