/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Chelo
 */
public class ImplementacionMySql implements AccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Utilizamos mysql para insertar");
    }

    @Override
    public void listar() {
        System.out.println("listamos con mysql");
        
    }
    
}
