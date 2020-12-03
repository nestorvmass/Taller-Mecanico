/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ness
 */
public abstract class Reparacion extends Trabajo{
    double precioFijo;
    double interes;
    double PrecioMaterial;

    public double getPrecioMaterial() {
        return PrecioMaterial;
    }

    public void setPrecioMaterial(double PrecioMaterial) {
        this.PrecioMaterial = PrecioMaterial;
    }

    public double getCostoReparacion() {
        return CostoReparacion;
    }

    public void setCostoReparacion(double CostoReparacion) {
        this.CostoReparacion = CostoReparacion;
    }
    double CostoReparacion;
    
    abstract double calcularReparacion(double costoMaterial );
    
    
}
