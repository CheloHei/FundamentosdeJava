/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadoresacceso;

import paquete1.Clase2;
import paquete2.Clase3;
import paquete2.Clase4;

/**
 *
 * @author Chelo
 */
public class ModificadoresAcceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Acceso de clase 2 a clase 1 (mismo paquete***)");
        new Clase2().pruevaDesdeClase2();
        
        //clase 3 extiende de clase1
        System.out.println("\n***  Acceso desde Clase 3 a clase 1 (diferente paquete, pero hereda****");
        new Clase3().pruebaClase3();
        
        //clase 4 a clase 1 
        System.out.println("\n***  Acceso desde Clase 4 a clase 1 (diferente paquete, pero NO hereda****");
        new Clase4().pruebaClase4();
        
        
    }
    
}
