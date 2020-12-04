/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Trabajo;
import Vista.VAumentarHoras;
import Vista.VRegistrarTrabajo;
import Vista.Vista;
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
    public ArrayList<Trabajo> trabajos = new ArrayList<Trabajo>();
    VAumentarHoras Ahoras = new VAumentarHoras();
    //Variables
    public static int consecutivo=0;
    
    //vistas
    VRegistrarTrabajo vista1;
    ControladorRegistrarTrabajo control_1;
    ControladorAumentarHora control_2;
    Vista pp;
    VAumentarHoras vista2;
  
    
    public ControladorPricipal(Vista vista, VRegistrarTrabajo VRegistrarTrabajo,VAumentarHoras VAumentarHoras) {
        this.pp = vista;
        this.vista1 = VRegistrarTrabajo;
        this.vista2 = VAumentarHoras;
        
        pp.mRegistrarTrabajo.addActionListener(this);
        pp.mAumentarHoras.addActionListener(this);
        pp.mAumentarValorMaterial.addActionListener(this);
        pp.mMostrarTrabajo.addActionListener(this);
        pp.mFinalizarTrabajo.addActionListener(this);
        /*
        this.perVista = pv;
        this.usDAO= pd;
        perVista.addusuario.addActionListener(this);
        perVista.listarEstudiantes.addActionListener(this);
        perVista.listarProfesores.addActionListener(this);
        perVista.buscarModificar.addActionListener(this);
        perVista.modificar.addActionListener(this);*/
         
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pp.mRegistrarTrabajo){
            System.out.println("Ventana Registra Trabajo");
            control_1 = new ControladorRegistrarTrabajo(vista1);
            vista1.setVisible(true);
            //vista1.TxtCodigo.setText("0");
            vista1.setLocationRelativeTo(null);
            vista1.setResizable(false);
        }else if(e.getSource()==pp.mAumentarHoras){
            control_2 = new ControladorAumentarHora(vista2);
            vista2.setVisible(true);
            vista2.setLocationRelativeTo(null);
            vista2.setResizable(false);
        }
    }
    
    
}
