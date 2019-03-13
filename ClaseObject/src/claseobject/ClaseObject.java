/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseobject;

/**
 *
 * @author Chelo
 */
public class ClaseObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Empleado emp1 = new Empleado("Juan",10000);
        Empleado emp2 = new Empleado("Juan",10000);
        
        
        compararObjetos(emp1,emp2);
    }
        public static void compararObjetos(Empleado emp1, Empleado emp2){
            System.out.println("Contendio de objetos "+ emp1);
            
            if (emp1 == emp2) {
                System.out.println("Tienen mimsa direccion en memoria");
            }else{
                System.out.println("No tienen mimsa direccion en memoria");
            }
            
            if (emp1.equals(emp2)) {
                System.out.println("son iguales");
            }else{
                System.out.println("No son iguales");
            }
            
            if (emp1.hashCode() == emp2.hashCode()) {
                System.out.println("Tienen el mismo codigo hash");
            }else{
                System.out.println("No son iguales codigo hash");
            }
                
            
        }
    
}
