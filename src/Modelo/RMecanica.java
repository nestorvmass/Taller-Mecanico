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
public class RMecanica extends Reparacion{
    
    public double getCostoReparacion(float costoMaterial) {
        CostoReparacion = calcularReparacion(costoMaterial);
        return CostoReparacion;
    }

    
       @Override
    public double CalcularTrabajo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    double calcularReparacion(double costoMaterial) {
        interes = 1.1;
        
        return precioFijo+(costoMaterial*(float)interes);
    }
    
}
