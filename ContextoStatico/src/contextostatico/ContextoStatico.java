/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contextostatico;

/**
 *
 * @author Chelo
 */
public class ContextoStatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona("Juan");
        System.out.println("Persona: " + p1);
        Persona p2 = new Persona("Juana");
        System.out.println("Persona: " + p2);
        
        System.out.println("No. personas: " + Persona.getContadorPersonas());

    }

}
