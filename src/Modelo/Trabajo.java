/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.beans.DesignMode;

/**
 *
 * @author ness
 */
public abstract class Trabajo {
    protected String descripcion;
    protected int horasTrabajo = 0;
    protected String tipoTrabajo;
    protected static int consecutivo = 0;
    protected int estadoTrabajo;

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }
    
    
    public Trabajo(){
        
    }
    
    
    public double precioTrabajo(int horas){
        double precio = 50000;
        return horas*precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public int getConsecutivo() {
        return consecutivo;
    }
    
    
    public void setConsecutivo() {
        consecutivo++;
    }
    

    public int getEstadoTrabajo() {
        return estadoTrabajo;
    }

    public void setEstadoTrabajo(int estadoTrabajo) {
        this.estadoTrabajo = estadoTrabajo;
    }
    
    public abstract double CalcularTrabajo();
    
}
