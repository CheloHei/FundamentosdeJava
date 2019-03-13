/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloque;

/**
 *
 * @author Chelo
 */
public class Persona {
    private final int idPersona;
    private static int contador;
    
    //bloque de inicio estatico
    static{
        //iniciamos el idPersonas desde el valor 10;
        contador = 10;
        //no se pueden usar variables no estaticas
        //ej idPersona = 1
        System.out.println("Se ejecuta el bloque estatico");
    }
    
    //bloque que inicializa atributos de la clase
    //el bloque se copia a cada constructor de la clase
    {
        System.out.println("Ejecuta bloque inicializador");
        idPersona = ++contador;
}
    Persona(){
        System.out.println("Ejecuta Constructor");
    }
    public int getId(){
        return idPersona;
    }
   
}
