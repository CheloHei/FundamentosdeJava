/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones1;
import domain.*;
/**
 *
 * @author Chelo
 */
public class Excepciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Division division = new Division(25,0);
        } catch (OperationException e) {
            System.out.println("Salio mal");
            e.printStackTrace();
        }
        
        
        
    }
    
}
