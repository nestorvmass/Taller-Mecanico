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
public class RLyP extends Reparacion{

    @Override
    double calcularReparacion(double costoMaterial ) {
        interes = 1.3;
        return costoMaterial*interes;
    }

    @Override
    public double CalcularTrabajo() {
        return this.getHorasTrabajo()*valorH+CalcularTrabajo();
    }

    @Override
    public String toString() {
        return "RLyP{" + '}';
    }
    
}
