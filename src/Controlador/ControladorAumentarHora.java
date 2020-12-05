/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author ness
 */

import Modelo.RLyP;
import Modelo.RMecanica;
import Modelo.Revision;
import Modelo.Trabajo;
import Modelo.TrabajoDao;
import Vista.VAumentarHoras;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class ControladorAumentarHora implements ActionListener, Myhelper{
    
    VAumentarHoras vista2;
    TrabajoDao tDao = new TrabajoDao();
    public ControladorAumentarHora(VAumentarHoras vista){
        vista2 = vista;
        vista2.batras.addActionListener(this);
        vista2.bagregarhoras.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista2.batras){
            System.out.println("Boton atras");
            limpiar();
            this.vista2.dispose();
        }else if(e.getSource()==vista2.bagregarhoras){
            if(vista2.txtcodigo.getText().length()>0 && vista2.txthoras.getText().length()>0){
                int api = tDao.AgregarHora(Integer.parseInt(vista2.txtcodigo.getText()),Integer.parseInt(vista2.txthoras.getText()));
                if(api==0){
                JOptionPane.showMessageDialog(null, "Se ha agregado EXITOSAMENTE");
                limpiar();
                }else if(api==1){
                    JOptionPane.showMessageDialog(null, "Debe crear por lo menos 1 trabajo para realizar esta operacion.");
                }else if(api==2){
                    JOptionPane.showMessageDialog(null, "El codigo no existe");
                }else if(api==3){
                    JOptionPane.showMessageDialog(null, "Imposible, el trabajo ya se encuenra finalizado.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS");
            }/*
            System.out.println("Agregar Horas");
            t = tDao.buscarTrabajo( Integer.parseInt(vista2.txtcodigo.getText() ));
            t.setDescripcion("Se volo todo");
           if(t != null){
               vista2.txtcodigo.setText(String.valueOf(t.getId()));
               System.out.println("horas: "+t.getHorasTrabajo());*/
        }
        
    }
    @Override
    public void limpiar(){
        vista2.txthoras.setText("");
        vista2.txtcodigo.setText("");
    }
}
