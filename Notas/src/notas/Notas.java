/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

/**
 *
 * @author Chelo
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int  [][] arregloCali = {
                {87,90,75},
                {100,95,80},
                {87,97,72},
                {67,70,95},
                {92,90,90}
        };
        
        
        Calificaciones misCalificaciones = new Calificaciones("Arreglos multidimensionales",arregloCali);
        System.out.printf("Bienvenido a las notas de %n%s%n%n",misCalificaciones.getMateria());
        misCalificaciones.procesaCalificaciones();
        
        
        
    }
    
}
