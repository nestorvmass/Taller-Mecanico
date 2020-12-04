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
public class Revision extends Trabajo{
    float extra = 30000;
    

     @Override
    public double CalcularTrabajo() {
        
        return horasTrabajo*PrecioTrbajo+extra;
    }
    

    
    
    
    
    
}
