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
    protected static int consecutivo = 0;
    protected int estadoTrabajo;
    
    
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

    public static int getConsecutivo() {
        int cons = consecutivo+1;
        setConsecutivo(cons);
        return cons;
    }

    private static void setConsecutivo(int consecutivo) {
        Trabajo.consecutivo = consecutivo;
    }
    

    public int getEstadoTrabajo() {
        return estadoTrabajo;
    }

    public void setEstadoTrabajo(int estadoTrabajo) {
        this.estadoTrabajo = estadoTrabajo;
    }
    
    
    
}
