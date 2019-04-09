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
public abstract class Empleado {
   
    private int codigo;
    private String nombre;
    private String cedula;
    private Date fechaContratacion;
    private double salario;
            
    public Empleado(int codigo, String nombre, String cedula, Date fechaContratacion, double salario)
    {
        this.codigo=codigo;
        this.nombre=nombre;
        this.cedula=cedula;
        this.fechaContratacion=fechaContratacion;
        this.salario=salario;
    }
    
    public int getcodigo()
    {
        return codigo;
    }
    public void setcodigo(int codigo)
    {
        this.codigo=codigo;
    }
    public String getnombre()
    {
        return nombre;
    }
    public void setnombre(String nombre)
    {
        this.nombre=nombre;
    }
    public String getcedula()
    {
        return cedula;
    }
    public void setcedula(String cedula)
    {
        this.cedula=cedula;
    }
    public Date getfechaContratacion()
    {
        return fechaContratacion;
    }
    public void setfechaContratacion(Date fechaContratacion)
    {
        this.fechaContratacion=fechaContratacion;
    }
    public double getsalario()
    {
        return salario;
    }
    public void setsalario(double salario)
    {
        this.salario=salario;
    }
    
 public abstract double calcularSalarioFinal();

    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", nombre=" + nombre + ", cedula=" + cedula + ", fechaContratacion=" + fechaContratacion + ", salario=" + salario + '}';
    }
  

}
