/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import com.gm.ventas.Orden;
import com.gm.ventas.Producto;

/**
 *
 * @author Chelo
 */
public class Ventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto p1 = new Producto("Camisa", 50.00);
        Producto p2 = new Producto("Vaquero", 80.00);
        Producto p3 = new Producto("Chaleco", 120.00);

        Orden orden1 = new Orden();

        orden1.agregarProducto(p1);
        orden1.agregarProducto(p2);
        orden1.agregarProducto(p3);
        
        orden1.mostrarOrden();

        
        
        
    }

}
