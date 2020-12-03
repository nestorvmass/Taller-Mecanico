/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VRegistrarTrabajo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ness
 */
public class ControladorRegistrarTrabajo implements ActionListener{
    VRegistrarTrabajo vista1;
    
    public ControladorRegistrarTrabajo(VRegistrarTrabajo vista1){
        this.vista1 = vista1;
        vista1.batras.addActionListener(this);
        vista1.bregistrartrabajo.addActionListener(this);
        vista1.listaOpciones.addActionListener(this);
        //vista1.listaOpciones.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista1.batras){
            System.out.println("Boton Atras");
            this.vista1.dispose();
        }else if(e.getSource()==vista1.bregistrartrabajo){
            if(vista1.txtdescripcion.getText().trim().length()>=1 
                    && Double.parseDouble(vista1.txthoras.getText())>=0 
                    && !(vista1.listaOpciones.getSelectedIndex()==0) )
            {
                System.out.println("Se valido");
            }else{
                JOptionPane.showMessageDialog(null, "importante que todos los campos esten bien diligenciados. "
                        + "Sigue las siguientes recomendaciones para que sepas donde estas fallando: \n"
                        + "1. Es obligatorio escoger el tipo de trabajo. \n"
                        + "2. Las horas a necesarias no pueden ser menores a 0. \n"
                        + "3. El campo de Descripcion no puede estar vacio o que solo tenga espacios. \n"
                        + "Intentalo de nuevo.");
            }
        }
    }
    
}
