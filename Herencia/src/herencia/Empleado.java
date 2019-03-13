/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Chelo
 */
//ATRIBUTOS Y METODOS PRIVADOS NO SE HEREDAN
public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    public static int contadorE;

    public Empleado(double sueldo, String nombre) {
        super(nombre);//Super debe ser la primera linea 
        this.sueldo = sueldo;
        this.idEmpleado = ++contadorE;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContadorE() {
        return contadorE;
    }

    public static void setContadorE(int contadorE) {
        Empleado.contadorE = contadorE;
    }

    @Override
    public String toString() {
        //con super to string llamamos el metodo de la clase padre y luego se agrega los valores del hijo
        return super.toString()+ "Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }

        

    }
    
    

