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
public class Persona {
    private String nombre;
    private int idPersona;
    private static int contadorPersonas;
    
    
    public Persona(String nombre){
        contadorPersonas++;
        idPersona = contadorPersonas;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", idPersona=" + idPersona + '}';
    }
    public static int getContadorPersonas(){
        return contadorPersonas;
    }
}
