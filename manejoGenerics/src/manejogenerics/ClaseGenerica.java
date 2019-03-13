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
public class ClaseGenerica<T> {
    //definimos con el operador generica
    T objeto;
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo es:  "+ objeto.getClass().getName());
    }
}
