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
    float precioFijo;
    double interes;
    double CostoReparacion;
    
    abstract float calcularReparacion(float costoMaterial );
    
    
}
