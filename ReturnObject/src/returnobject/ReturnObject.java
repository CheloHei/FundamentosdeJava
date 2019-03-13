/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returnobject;

/**
 *
 * @author Chelo
 */
public class ReturnObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Suma s = creaObjetoSuma();
        int resultado = s.a +  s.b;
        System.out.println("Resultado:" + resultado);
    }

    public static Suma creaObjetoSuma() {
        Suma s =new Suma(5,5);
        return s;
                           
        }
    }

    class Suma {

        int a;
        int b;

        Suma(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

