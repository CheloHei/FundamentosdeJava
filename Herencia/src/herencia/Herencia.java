/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Chelo
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado e1 = new Empleado(25000,"Juan");
        System.out.println("Empleado 1 "+e1);
        
        Empleado e2 = new Empleado(15000,"jonh");
        e2.setEdad(25);
        e2.setGenero('M');
        e2.setDireccion("Asuncion");
        System.out.println(e2);
        
        Cliente c1 = new Cliente(new java.util.Date(),false);
        System.out.println(c1);
        
        
        
        
    }
    
}
