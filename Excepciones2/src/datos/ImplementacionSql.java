/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import excepciones.*;

/**
 *
 * @author Chelo
 */
public class ImplementacionSql implements AccesoDat {
    private boolean simularError;
    
    public  void insertar() throws AccesoDatos{
        if (simularError) {
            throw new EscrituraDatos("Error de escritura de datos");
        }else{
            System.out.println("Insertar desde mysql");
        }
    }

    @Override
    public void listar() throws AccesoDatos {
        if (simularError) {
            throw new LecturaDatos("Error de lectura");
        }else{
            System.out.println("Listar de mysql");
        }
    }
    
    public boolean isSimularError(){
        return simularError;
    }

    @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;
    }
}
