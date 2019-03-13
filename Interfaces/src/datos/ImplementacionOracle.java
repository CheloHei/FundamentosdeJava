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
public class ImplementacionOracle implements AccesoDatos {

    @Override
    public void insertar() {
        System.out.println("insertar desde oracle");
    }

    @Override
    public void listar() {
        System.out.println("listar desde oracle");
    }
    
}
