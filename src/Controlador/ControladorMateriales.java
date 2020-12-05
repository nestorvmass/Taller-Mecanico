/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.TrabajoDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ness
 */
public class ControladorMateriales implements ActionListener, Myhelper{
    
    VAumentarMateriales vista3;
    TrabajoDao tDao = new TrabajoDao();
    
    public ControladorMateriales(VAumentarMateriales vista){
        this.vista3=vista;
        vista3.bagregamaterial.addActionListener(this);
        vista3.batras.addActionListener(this);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==vista3.batras){
            System.out.println("Boton atras");
            limpiar();
            this.vista3.dispose();
        }else if(e.getSource()==vista3.bagregamaterial){
            if(vista3.txtcodigo.getText().length()>0 && vista3.txtcostoMaterial.getText().length()>0){
                int api = tDao.AgregarMaterial(Integer.parseInt(vista3.txtcodigo.getText()),Double.parseDouble(vista3.txtcostoMaterial.getText()));
                if(api==0){
                JOptionPane.showMessageDialog(null, "Se ha agregado EXITOSAMENTE");
                }else if(api==1){
                    JOptionPane.showMessageDialog(null, "Debe crear por lo menos 1 trabajo para realizar esta operacion.");
                    limpiar();
                }else if(api==2){
                    JOptionPane.showMessageDialog(null, "El Codigo no existe o hace refercia a una Revision y no a una reparacion.");
                    limpiar();
                }else if(api==3){
                    JOptionPane.showMessageDialog(null, "Imposible, el trabajo ya se encuenra finalizado.");
                    limpiar();
                }
            }else{
                JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS");
            }
        
    }
    
    
    
    }   

    @Override
    public void limpiar() {
        vista3.txtcodigo.setText("");
        vista3.txtcostoMaterial.setText("");
    }
}
