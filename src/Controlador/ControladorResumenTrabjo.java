/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Trabajo;
import Modelo.TrabajoDao;
import Vista.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
/**
 *
 * @author ness
 */
public class ControladorResumenTrabjo implements ActionListener, Myhelper{
    TrabajoDao tdao = new TrabajoDao();
    VResumenTrabajo vista5;
    
    public ControladorResumenTrabjo(VResumenTrabajo vista){
        this.vista5=vista;
        vista5.batras.addActionListener(this);
        vista5.bresumentrabajo.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista5.batras){
            System.out.println("Boton Atras");
            this.vista5.setVisible(false);
        }else if(e.getSource()==vista5.bresumentrabajo){
            Trabajo t = new Trabajo() {
                @Override
                public double CalcularTrabajo() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
            
            t = tdao.resumenTrabajo(Integer.parseInt(vista5.txtcodigo.getText()));
            System.out.println("Tipo de trabajo : "+t.getTipoTrabajo());
            if(!(t.getTipoTrabajo()==null)){
                vista5.txtDescripciontrabajo.setText(t.getDescripcion());
                vista5.txtTipotrabajo.setText(t.getTipoTrabajo());
                vista5.txthoras.setText(String.valueOf(t.getHorasTrabajo()));
                vista5.txtCostoTrabajo.setText(String.valueOf(t.getPrecioTotal()));
            }else{
                JOptionPane.showMessageDialog(null, "Ups! al parecer no hay ningun trabajo con el codigo ingresado.");
                limpiar();
            }
            
        }
    }

    @Override
    public void limpiar() {
        vista5.txtCostoTrabajo.setText("");
        vista5.txtDescripciontrabajo.setText("");
        vista5.txtTipotrabajo.setText("");
        vista5.txtcodigo.setText("");
        vista5.txthoras.setText("");
    }
    
}
