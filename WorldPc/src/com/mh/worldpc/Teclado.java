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
public class Teclado extends DispositivoEntrada {
    private int idTeclado;
    private static int contadorTeclado;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado= contadorTeclado;
    }

    @Override
    public String toString() {
        return super.toString()+ "Teclado{" + "idTeclado=" + idTeclado + '}';
    }
    
}
