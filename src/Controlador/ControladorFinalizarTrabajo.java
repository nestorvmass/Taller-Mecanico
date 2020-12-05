/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.TrabajoDao;
import Vista.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
/**
 *
 * @author ness
 */
public class ControladorFinalizarTrabajo implements ActionListener, Myhelper{
    TrabajoDao tDao = new TrabajoDao();
    VFinalizarTrabajo vista4;
    
    public ControladorFinalizarTrabajo(VFinalizarTrabajo vista){
        this.vista4 = vista;
        vista4.bFinalizarTrabajo.addActionListener(this);
        vista4.bAtras.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista4.bAtras){
            System.out.println("Boton atras");
            limpiar();
            this.vista4.dispose();
        }else if(e.getSource()==vista4.bFinalizarTrabajo){
            if(vista4.txtcodigo.getText().length()>0){
                int api = tDao.finalizarTrabajo(Integer.parseInt(vista4.txtcodigo.getText()));
                if(api==0){
                JOptionPane.showMessageDialog(null, "Se ha agregado EXITOSAMENTE");
                limpiar();
                }else if(api==1){
                    JOptionPane.showMessageDialog(null, "Debe crear por lo menos 1 trabajo para realizar esta operacion.");
                }else if(api==2){
                    JOptionPane.showMessageDialog(null, "No codigo de trabajo no existe.");
                }else if(api==3){
                    JOptionPane.showMessageDialog(null, "Imposible, el trabajo ya se encuenra finalizado.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS");
            }
        
        }
    }

    @Override
    public void limpiar() {
        vista4.txtcodigo.setText("");
    }
    
}
