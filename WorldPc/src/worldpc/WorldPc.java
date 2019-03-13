/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldpc;

import com.mh.worldpc.Computadora;
import com.mh.worldpc.Monitor;
import com.mh.worldpc.Mouse;
import com.mh.worldpc.Order;
import com.mh.worldpc.Teclado;

/**
 *
 * @author Chelo
 */
public class WorldPc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Teclado teclado = new Teclado("Optico","Dell");
        Mouse mouse = new Mouse("Optico","HP");
        Monitor monitor = new Monitor("Dell",25.0);
        Computadora computadora = new Computadora("Alienware",monitor,teclado,mouse);
        Order orden1= new Order();
        orden1.agregarPc(computadora);
        orden1.MostrarOrden();
        
    }
    
}
