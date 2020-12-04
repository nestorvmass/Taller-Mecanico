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
    protected int estadoTrabajo;
    protected int id;
    protected static double PrecioTrbajo = 50000;

    
    //ID y Consecutivo

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
 
    //2 Descripcion 
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //3 Horas de trabajo
    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }
    
    //4 Estado trabajo
    public int getEstadoTrabajo() {
        return estadoTrabajo;
    }

    public void setEstadoTrabajo(int estadoTrabajo) {
        this.estadoTrabajo = estadoTrabajo;
    }
    
    // 5 tipo trabajo
    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }
    // Precio trabajo

    public double getPrecioTrbajo() {
        return PrecioTrbajo;
    }

    public static void setPrecioTrbajo(double PrecioTrbajo) {
        Trabajo.PrecioTrbajo = PrecioTrbajo;
    }
    
    
    

    
    /*
    public double getValorH() {
        return valorH;
    }
    
    public void setValorH(double valorH) {
        this.valorH = valorH;
    }
    protected double valorH = 50000;*/
    
    
        
    
    public abstract double CalcularTrabajo();

    @Override
    public String toString() {
        return "Trabajo{" + "descripcion=" + descripcion + ", horasTrabajo=" + horasTrabajo + ", tipoTrabajo=" + tipoTrabajo + ", estadoTrabajo=" + estadoTrabajo + ", id=" + id+'}';
    }
    
    
    
    
}
