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
public class Order {

    int idOrden;
    Computadora[] computadoras;
    static int contadorOrdenes;
    int contadorCompu;
    static final int maxCompus = 10;

    public Order() {
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[maxCompus];
    }

    public void agregarPc(Computadora computadora) {
        if (contadorCompu < maxCompus) {
            computadoras[contadorCompu++] = computadora;
        } else {
            System.out.println("Se ha superado el maximo de pc" + maxCompus);

        }
    }

    public void MostrarOrden() {
        System.out.println("Orden =" + idOrden);
        System.out.println("Computadora de orden");
        for (int i = 0; i < contadorCompu; i++) {
            System.out.println("computadoras[i]");
        }
    }
}


