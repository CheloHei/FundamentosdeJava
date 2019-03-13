/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones2;
import datos.*;
import excepciones.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Chelo
 */
public class Excepciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AccesoDat datos = new ImplementacionSql();
        //cambiamos el estado de la bandera
        datos.simularError(true);
        ejecutar(datos,"listar");
        
        datos.simularError(false);
        System.out.println("");
        ejecutar(datos,"insertar");
    }

    private static void ejecutar(AccesoDat datos, String accion) {
        if ("listar".equals(accion)){
            try{
                datos.listar();
            }
            //si se van a procesar varias excepciones e la misma jerarquia
            //siempre se debe procesar la de menor jerarquia
            //y posterior la de mayor
            
            catch(LecturaDatos ex){
                System.out.println("Error de lectura:  Procesa la excepcion mas especifica de lectura de datos");
            } catch (AccesoDatos ex) {
                System.out.println("Siguiente excepcion en la jerarquia");
            }catch(Exception ex){
                System.out.println("Mayor jerarquia de excepcion");
            }
            finally{
                System.out.println("Bloque obligatorio");
            }
        }
        else if("insertar".equals(accion)){
            try{
                datos.insertar();
            }catch(AccesoDatos ex){
                System.out.println("Solo error de acceso a datos");
            }
        }else
            System.out.println("No se proporciono accion conocida");
    }
    
}
