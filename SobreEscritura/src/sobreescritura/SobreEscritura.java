/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreescritura;

/**
 *
 * @author Chelo
 */
public class SobreEscritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado empleado = new Empleado("Juan",1000);
        System.out.println(empleado.obtenerDetalles());
        Gerente gerente = new Gerente("Karala",2000,"finanzas");
        System.out.println(gerente.obtenerDetalles());
    }
    
}
