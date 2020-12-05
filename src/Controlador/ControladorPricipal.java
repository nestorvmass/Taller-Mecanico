/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Trabajo;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Action;

/**
 *
 * @author ness
 */
public class ControladorPricipal implements ActionListener{
     /*vista perVista = new  vista ();
     usuarioDAO usDAO = new usuarioDAO ();
     Usuarios us= new Usuarios ();*/
    //Variables
    public static int consecutivo=0;
    
    //vistas
    VRegistrarTrabajo vista1;
    VAumentarHoras vista2;
    VAumentarMateriales vista3;
    VFinalizarTrabajo vista4;
    VResumenTrabajo vista5;
    ControladorRegistrarTrabajo control_1;
    ControladorAumentarHora control_2;
    ControladorMateriales control_3;
    ControladorFinalizarTrabajo control_4;
    ControladorResumenTrabjo control_5;
    
    
    Vista pp;
    
  
    
    public ControladorPricipal(Vista vista, VRegistrarTrabajo VRegistrarTrabajo,VAumentarHoras VAumentarHoras, VAumentarMateriales VAumentarMateriales, VFinalizarTrabajo VFinalizarTrabajo, VResumenTrabajo VResumenTrabajo) {
        this.pp = vista;
        this.vista1 = VRegistrarTrabajo;
        this.vista2 = VAumentarHoras;
        this.vista3 = VAumentarMateriales;
        this.vista4 = VFinalizarTrabajo;
        this.vista5 = VResumenTrabajo;
        
        pp.mRegistrarTrabajo.addActionListener(this);
        pp.mAumentarHoras.addActionListener(this);
        pp.mAumentarValorMaterial.addActionListener(this);
        pp.mMostrarTrabajo.addActionListener(this);
        pp.mFinalizarTrabajo.addActionListener(this);
        control_1 = new ControladorRegistrarTrabajo(vista1);
        control_2 = new ControladorAumentarHora(vista2);
        control_3 = new ControladorMateriales(vista3);
        control_4 = new ControladorFinalizarTrabajo(vista4);
        control_5 = new ControladorResumenTrabjo(vista5);
        
         
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pp.mRegistrarTrabajo){
            System.out.println("Ventana Registra Trabajo");
            vista1.setVisible(true);
            vista1.setLocationRelativeTo(null);
            vista1.setResizable(false);
        }else if(e.getSource()==pp.mAumentarHoras){
            vista2.setVisible(true);
            vista2.setLocationRelativeTo(null);
            vista2.setResizable(false);
        }else if(e.getSource()==pp.mAumentarValorMaterial){
            vista3.setVisible(true);
            vista3.setLocationRelativeTo(null);
            vista3.setResizable(false);
        }else if(e.getSource()==pp.mFinalizarTrabajo){
            vista4.setVisible(true);
            vista4.setLocationRelativeTo(null);
            vista4.setResizable(false);
        }else if(e.getSource()==pp.mMostrarTrabajo){
            vista5.setVisible(true);
            vista5.setLocationRelativeTo(null);
            vista5.setResizable(false);
        }
    }
}
