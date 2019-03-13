/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Chelo
 */
public class Clase2 {
    public Clase2(){
        System.out.println("");
        //constructor publico
        new Clase1(1);
        
        //constructor protegido
        new Clase1(1,2);
        //constructor paquete
        new Clase1(1,3,2);
        //constructor privado
        //new Clase1(1,2,3,4);
        
    }
    
    public void pruevaDesdeClase2(){
        Clase1 c1 = new Clase1();
        System.out.println("");
        System.out.println("atributo publico" + c1.atrPublico);
        System.out.println("atributo protegido" + c1.atrProtegido);
        System.out.println("atributo default" + c1.atrPaquete);
        System.out.println("atributo privado");
        
        System.out.println(""
                + "");
        System.out.println("Metodo publico"  + c1.metodoPublico());
        System.out.println("Metodo protected"  + c1.metodoProtegido());
        System.out.println("Metodo paquete"  + c1.metodoPaquete());
    }
}
