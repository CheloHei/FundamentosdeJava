/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;

/**
 *
 * @author Chelo
 */
public class Casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creamos objeto de mayor jerarquia
        Empleado empleado;
        //asignamos referncia de un objeto de menor jerarquia
        //esto es upcasting no hay necesidad de notacion especial
        empleado = new Escritor("Roy",15000,TipoEscritura.CLASICO);
        
        //sin embargo si se quiere acceder al detalle de la clase Escritor no es posible ya que esas caracteristias no estan en comun
        //entre todas las clases de la jerarquia de clases
        //emp.getTipoEscrituraEnTexto()
        
        //se imprime los detalles en un metodo generico
        imprimirDetalles(empleado);
        
        //2.Podemos hacer lo mismo con la  clase gerente
        //esto es upcasting por lo que no requiere una sintaxis especial
        empleado = new Gerente("Laura", 18000,"Sistemas");
        
        imprimirDetalles(empleado);
    }

    private static void imprimirDetalles(Empleado empleado) {
        String resultado = null;
        //imprimir detalles es general para todos por el polimorfismo
        //no se necesita de ninguna conversion
        
        System.out.println("\n Detalles" + empleado.obtenerDetalles());
        
        //pero los detalles de cada clase debemos hacer un downcasting
        if (empleado instanceof Escritor) {
            //convertimos al objeto al tipo inferior deseado
            //convierte objeto = Downcasting
            Escritor escritor = (Escritor)empleado;
            //finalmente podemos acceder a los metodos de la clase Escritor
            resultado = escritor.getTipoEscrituraEnTexto();
            
            //Otra forma es hacer la conversion en la misma linea de  cdoigo 
            //esto es muy comun encontrar 
            //para evitar creacion de variables innecesarias
            
            resultado = ((Escritor)empleado).tipoEscritura.getDescripcion();
            System.out.println("resutlado tipoEscritura: " + resultado);
        } else if (empleado instanceof Gerente){
            resultado = ((Gerente)empleado).getDepartamento();
            System.out.println("resutlado depto: " + resultado);
        }
        
        
    }
    
}
