/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Chelo
 */
public class Division {
    private int numerador;
    private int denominador;
    
    public Division(int numerador,int denominador) throws OperationException{
        if (denominador == 0) {
            throw new OperationException("Denominador igual a Cero");
        } else{
            this.numerador = numerador;
            this.denominador = denominador;
        }
    }
    public void visualizarOperacion(){
        System.out.println("Resultado: " + numerador/denominador);
    }
}
