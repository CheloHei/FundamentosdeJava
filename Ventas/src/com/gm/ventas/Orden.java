/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.ventas;

/**
 *
 * @author Chelo
 */
public class Orden {
    private final int idOrden;
    private final Producto productos[];
    private static  int contadorOrden;
    private int contadorProductos;
    private static final int maxPro = 10;
    
    public Orden(){
        this.idOrden = ++contadorOrden;
        productos = new Producto[maxPro];
        
    }
    public void agregarProducto(Producto producto){
        //si los productos agregados no superan al maximo
        //de productos, agregamos al nuevo producto
        if (contadorProductos < maxPro) {
            //agregamos el nuevo producto al arreglo 
            //e incrementamos el contador de productos 
            productos[contadorProductos++] = producto;
        }else{
            System.out.println("Se ha superado el maximo de producto" + maxPro);
        }
    }
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < contadorProductos; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }
    public  void mostrarOrden(){
        System.out.println("Orden #:" + idOrden);
        System.out.println("Total de la Orden #:" + calcularTotal());
        System.out.println("Productos de la orden " + idOrden + ":");
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println(productos[i]);
        }
    }
}
