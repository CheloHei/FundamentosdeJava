/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesgenericas;
import java.util.*;
/**
 *
 * @author Chelo
 */
public class ColeccionesGenericas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> lista = new ArrayList<>();
        lista.add("1");
        lista.add("2");
        
        imprimir(lista);
        
        Set<String> set = new HashSet<>();
        set.add("hola");
        set.add("carola");
        
        imprimir(set);
        
        Map<String,String> mapa = new HashMap<>();
        mapa.put("1", "uno");
        mapa.put("2", "tres");
        mapa.put("3", "cuatro");
        
        imprimir(mapa.keySet());
        imprimir(mapa.values());
        
        
    }
    private static void imprimir(Collection<String> col){
        for (String string : col) {
            System.out.println(col);
        }
        System.out.println("");
    }
}
