/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Clase1;

/**
 *
 * @author Chelo
 */
public class Clase3 extends Clase1{
    
    
    public Clase3(){
    //constructor protegido, al ser una subclase
    //aunque este en otro paquete
    super(1,2);
    //acceso package y al estar afuera de paquete esta restringido
    //super(1,2,3)
    //acceso privado, restringido 
    //super(1,2,3,4);
    }
    
    public void pruebaClase3(){
        //acceso clase1 desde clase3
        //clase 3 extiende de clase1
        Clase1 c1 = new Clase1();
              System.out.println("");
              System.out.println("Atr publico: " + c1.atrPublico+ "o heredado: " + atrPublico);
              System.out.println("Atr protegido (heredadado) " + atrProtegido);
        
              //constructor publico
              new Clase1();
              //los demas constructores no se pueden probar asi sino desde el constructor de esta clase
              //ya que esta es una subclase en otro paquete
              
              System.out.println("");
              System.out.println("metodo publico  " + c1.metodoPublico());
              System.out.println("metodo protegido  " + metodoProtegido());
    }
}
