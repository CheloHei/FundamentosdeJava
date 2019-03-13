/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones1;

import domain.*;

/**
 *
 * @author Chelo
 */
public class ExcepcionesArg {

    public static void main(String[] args) throws OperationException {
        try {
            int op1 = Integer.parseInt(args[0]);
            int op2 = Integer.parseInt(args[1]);
            Division div = new Division(op1, op2);
            div.visualizarOperacion();
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("Error ");
            System.out.println("Error al acceder un elemento fuera de rango");
            aie.printStackTrace();
        } catch (NumberFormatException nfe) {
            System.out.println("Otra mas ");
            System.out.println("Algun elemento no es entero ");
            nfe.printStackTrace();
        } finally {
            System.out.println("Fianl de las excpeciones");
        }
    }
}
