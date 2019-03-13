/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Chelo
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado emp = new Empleado("Juan",2000);
        imprimirDetalles(emp);
        Gerente ger = new Gerente("Kara",48545,"Finanzas");
        imprimirDetalles(ger);
        
    }
    public static void imprimirDetalles(Empleado emp){
            System.out.println(emp.obtenerDetalles()
            );
    }
}
