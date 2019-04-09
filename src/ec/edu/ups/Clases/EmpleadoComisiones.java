/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Clases;

/**
 *
 * @author Estudiante
 */
public class EmpleadoComisiones {
     private double ventasMensuales;

    public EmpleadoComisiones(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    public double getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    @Override
    public String toString() {
        return "EmpleadoComisiones{" + "ventasMensuales=" + ventasMensuales + '}';
    }
    public void calcularSalarioFinal()
    {
        if (ventasMensuales >= 500 && ventasMensuales <= 100)
        {
            return super.getSalario() + (ventasMensuales * 0.10);
        }
    }
}
