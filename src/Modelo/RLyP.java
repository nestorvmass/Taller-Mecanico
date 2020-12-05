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
public class RLyP extends Trabajo implements Reparacion{
    double precioMaterial=0;
    
    public RLyP(){
        
    }

    public double getPrecioMaterial() {
        return precioMaterial;
    }

    public void setPrecioMaterial(double precioMaterial) {
        this.precioMaterial = precioMaterial;
    }
    
    
    
    
    
    @Override
    public double CalcularTrabajo() {
        
        return horasTrabajo*PrecioTrbajo+calcularReparacion();
    }

    @Override
    public double calcularReparacion() {
        return precioFijoMantenimiento+(precioMaterial*1.3);
    }


    
}
