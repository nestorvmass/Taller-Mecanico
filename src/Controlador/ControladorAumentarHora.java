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
public class ControladorAumentarHora implements ActionListener{
    
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
            this.vista2.dispose();
        }else if(e.getSource()==vista2.bagregarhoras){
            if(vista2.txtcodigo.getText().length()>0 && vista2.txthoras.getText().length()>0){
                if(tDao.AgregarHora(Integer.parseInt(vista2.txtcodigo.getText()),Integer.parseInt(vista2.txthoras.getText()))){
                JOptionPane.showMessageDialog(null, "HORAS AGREGADAS EXITOSAMENTE");
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "TODOS LOS CAMPSO SON OBLIGATORIOS");
            }/*
            System.out.println("Agregar Horas");
            t = tDao.buscarTrabajo( Integer.parseInt(vista2.txtcodigo.getText() ));
            t.setDescripcion("Se volo todo");
           if(t != null){
               vista2.txtcodigo.setText(String.valueOf(t.getId()));
               System.out.println("horas: "+t.getHorasTrabajo());*/
        }
        
    }
    
    
}
