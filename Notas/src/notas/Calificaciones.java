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
public class Calificaciones {

    private String materia;
    private int[][] calificaciones;

    public Calificaciones(String materia, int[][] calificaciones) {
        this.materia = materia;
        this.calificaciones = calificaciones;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void procesaCalificaciones() {
        imprimirCalificaciones();

        System.out.printf("%n%s %d%n%s %d",
                "la calificacion mas baja es:",
        obtenerMinimo(),
        
        "La calificacion mas alta es:",
        
        obtenerMaximo());
        
        System.out.println("");

        imprimirGraficoBarras();
    }

    public int obtenerMinimo() {
        int calBaja = calificaciones[0][0];
        //itera a traves de las filas de calificaciones
        for (int[] califEstudiante : calificaciones) {
            //itera a traves de las columnas de las filas 
            for (int calificacion : califEstudiante) {
                if (calificacion < calBaja) {
                    calBaja = calificacion;
                }
            }
        }
        
        
        
        return calBaja;
    }
    public int obtenerMaximo() {
        int calAlta = calificaciones[0][0];
        //itera a traves de las filas de calificaciones
        for (int[] califEstudiante : calificaciones) {
            //itera a traves de las columnas de las filas 
            for (int calificacion : califEstudiante) {
                if (calificacion > calAlta) {
                    calAlta = calificacion;
                }
            }
        }
        
        
        
        return calAlta;
    }
    
    
    public void imprimirCalificaciones(){
        System.out.printf("Las calificaciones son: %n%n");
        System.out.println("            ");
        
        //crea un encabezado de columna para cada una de las pruebas
        for (int i = 0; i < calificaciones[0].length; i++) {
            System.out.printf("Prueba %d",i + 1);
        }
        System.out.println("Promedio");
        
        //crear filas columnas de notas
        for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) {
            System.out.printf("Estudiante %2d", estudiante + 1);
            for (int prueba : calificaciones[estudiante]) {
                System.out.printf("%8d" ,prueba);
            }
            
            //llama a obtener promedio
            //pasa filas de calificaciones para obtener promedio
            //en el argumento
            double promedio = obtenerPromedio(calificaciones[estudiante]);
            System.out.printf("%9.2f%n",promedio);
        }
    }
    
    public double obtenerPromedio(int[] conjuntoCalif){
        int total = 0;
        
        //sumar calificaciones de estudiante
        for (int calificacion : conjuntoCalif) {
            total +=  calificacion;
        }
        
        return (double) total / conjuntoCalif.length;
    }
    public void imprimirGraficoBarras(){
        System.out.println("Distribucion de calificaciones general");
    
    
        int[] frecuencia = new int[11];
        
        for (int[] califEstudiantes : calificaciones) {
            for (int calificacion : califEstudiantes) {
                ++frecuencia[calificacion/10];
            }
        }
        
        for (int cuenta = 0; cuenta < frecuencia.length; cuenta++) {
            if (cuenta ==10) {
                System.out.printf("%5d",100);
            }
            else{
                System.out.printf("%02d-%02d:",
                        cuenta * 10, cuenta*10+9);
            }
            
            for (int estrellas = 0; estrellas < frecuencia.length; estrellas++) {
                System.out.println("*");
            }
            System.out.println("*");
        }
    
    
    
    
    }
}
