/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import excepciones.AccesoDatos;

/**
 *
 * @author Chelo
 */
public interface AccesoDat {
    public abstract void  insertar() throws AccesoDatos;
    public abstract void  listar() throws AccesoDatos;
    public abstract void  simularError(boolean simularError);
}
