/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;
import java.util.*;
/**
 *
 * @author Chelo
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //la clase list es una interface 
        //para crear un objeto se debe utilizar la clase arraylist
        //porque esta ya implementa list
       List miLista = new ArrayList(); 
       miLista.add("1");
       miLista.add("2");
       miLista.add("3");
       miLista.add("4");
        
       imprimir(miLista);
       //no permite elementos repetidos
       Set miSet = new HashSet();
       miSet.add("100");
       miSet.add("200");
       miSet.add("300");
       imprimir(miSet);
       
       Map mapa = new HashMap();
       mapa.put("1", "Joni");
       mapa.put("2", "Jonas");
       mapa.put("3", "Estrella");
       //se imprimen las llaves
       imprimir (mapa.keySet());
       imprimir(mapa.values());
       
       
        
        
    }
    private static  void imprimir(Collection coleccion){
        for (Object object : coleccion) {
            System.out.println(object+"");
        }
        System.out.println("");
    }
    
}
