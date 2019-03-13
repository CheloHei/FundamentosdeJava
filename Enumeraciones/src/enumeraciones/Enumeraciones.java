/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeraciones;

/**
 *
 * @author Chelo
 */
public class Enumeraciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Valor 1 :"  + Dias.LUNES);
        System.out.println("Continente"+Continentes.AMERICA);
        System.out.println("Cantidad en America " + Continentes.AMERICA.getPaises());
        System.out.println("");
indicarPaises(Continentes.AFRICA);
        System.out.println("");
        imprimirContinentes();
    }
    
    public static void indicarDia(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia");
            case MARTES:
            System.out.println("Segundo dia");
            break;
            default:
                System.out.println("Demas dias");
            
        }
    }
    public static  void indicarPaises(Continentes continentes){
        switch(continentes){
            case AFRICA:
                System.out.println("N° de paises en " + continentes +":"+ continentes.getPaises());
                break;
            default:
                System.out.println("Sigue el resto");
        }
    }
    public static  void imprimirContinentes(){
        for (Continentes contin : Continentes.values()) {
            System.out.println("continentes:"+contin+" contiene "+contin.getPaises()+" paises");
        }
    }
    
}
