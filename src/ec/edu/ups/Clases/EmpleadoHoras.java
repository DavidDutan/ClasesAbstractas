/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Clases;

import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class EmpleadoHoras extends Empleado {
    private int numeroHorasExtras;
    private double costoHorasExtras;

    public EmpleadoHoras(int numeroHorasExtras, int codigo, String nombre, String cedula, Date fechaContratacion, double salario) {
        super(codigo, nombre, cedula, fechaContratacion, salario);
        this.numeroHorasExtras = numeroHorasExtras;
    }

    public EmpleadoHoras(double costoHorasExtras, int codigo, String nombre, String cedula, Date fechaContratacion, double salario) {
        super(codigo, nombre, cedula, fechaContratacion, salario);
        this.costoHorasExtras = costoHorasExtras;
    }

    public int getNumeroHorasExtras() {
        return numeroHorasExtras;
    }

    public void setNumeroHorasExtras(int numeroHorasExtras) {
        this.numeroHorasExtras = numeroHorasExtras;
    }

    public double getCostoHorasExtras() {
        return costoHorasExtras;
    }

    public void setCostoHorasExtras(double costoHorasExtras) {
        this.costoHorasExtras = costoHorasExtras;
    }
    

    @Override
    public double calcularSalarioFinal() {
        return super.getsalario()+(numeroHorasExtras*costoHorasExtras);
      
    }
    
    
}
