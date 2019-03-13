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
public class Persona {
    private final int idPersona;
    private String nombre;
    
    private static int contador;
    
    Persona(String nombre){
        idPersona = ++ contador;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
