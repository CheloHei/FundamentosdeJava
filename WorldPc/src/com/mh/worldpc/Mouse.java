/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mh.worldpc;

/**
 *
 * @author Chelo
 */
public class Mouse extends DispositivoEntrada {
    private int idMouse;
    private static int contadorMouse;

    public Mouse(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idMouse = contadorMouse;
    }

    @Override
    public String toString() {
        return super.toString()+ "Mouse{" + "idMouse=" + idMouse + '}';
    }
    
    
    
}
