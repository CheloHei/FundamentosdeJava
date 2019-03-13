package pasoreferencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chelo
 */
public class Persona {
    String nombre;
    public void colocarNombre(String nuevoName){
        this.nombre = nuevoName;
    }
    public String obtener(){
        return nombre;
    }
}
