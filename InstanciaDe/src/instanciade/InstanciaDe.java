/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instanciade;

/**
 *
 * @author Chelo
 */
public class InstanciaDe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FiguraGeometrica figura;
        figura = new Elipse();
        
        determinaTipo(figura);
        determinaTodoTipos(figura);
    }
    private static void determinaTipo(FiguraGeometrica figura){
        if (figura instanceof Elipse) {
            System.out.println("es elipse");
            
        } else if (figura instanceof Circulo){
            System.out.println("es un circulo");
        }
    }
    private static void determinaTodoTipos(FiguraGeometrica figura){
        if (figura instanceof Elipse) {
            System.out.println("es elipse");
            
        }
        if (figura instanceof Circulo){
            System.out.println("es un circulo");
        }
        if (figura instanceof FiguraGeometrica){
            System.out.println("es una  figura");
        }
    }
    
}
