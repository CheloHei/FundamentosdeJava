/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;

/**
 *
 * @author Chelo
 */
public class Escritor extends Empleado{
    
    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo,TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    public String obtenerDetalles(){
        
        return super.obtenerDetalles() + ", tipoEscritura: "+ tipoEscritura.getDescripcion();
    }
    
    
    public TipoEscritura getTipoEscritura(){
        return tipoEscritura;
    }
    
    public String getTipoEscrituraEnTexto(){
        return tipoEscritura.getDescripcion();
    }
    
}
