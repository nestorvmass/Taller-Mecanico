/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.RLyP;
import Modelo.RMecanica;
import Modelo.Revision;
import Modelo.Trabajo;
import Modelo.TrabajoDao;
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
    TrabajoDao tDao = new TrabajoDao();
    //int consecutivo = 0;
    
    public ControladorRegistrarTrabajo(VRegistrarTrabajo vista){
        this.vista1 = vista;
        vista1.batras.addActionListener(this);
        vista1.bregistrartrabajo.addActionListener(this);
        vista1.listaOpciones.addActionListener(this);
        //vista1.listaOpciones.addActionListener(this);
        vista1.TxtCodigo.setText(String.valueOf(ControladorPricipal.consecutivo));
        vista1.blistar.addActionListener(this);
        vista1.txthoras.setText("0");
        vista1.txthoras.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista1.batras){
            System.out.println("Boton Atras");
            this.vista1.setVisible(false);
        }else if(e.getSource()==vista1.bregistrartrabajo){
            System.out.println("Se ha aumentado el consecutivo a: "+ControladorPricipal.consecutivo);
            if(vista1.txtdescripcion.getText().trim().length()>=1 
                    && !vista1.txthoras.getText().isEmpty()
                    && Double.parseDouble(vista1.txthoras.getText())>=0
                    && !(vista1.listaOpciones.getSelectedIndex()==0) )
            {
                if( tDao.addTrabajo(CrearTrabajo(Integer.parseInt(vista1.TxtCodigo.getText()), vista1.txtdescripcion.getText(), vista1.listaOpciones.getSelectedItem().toString(), Integer.parseInt(vista1.txthoras.getText()))) ){
                    ControladorPricipal.consecutivo++;
                    vista1.TxtCodigo.setText(String.valueOf(ControladorPricipal.consecutivo));
                    JOptionPane.showMessageDialog(null, "Agregado Existosamente");
                    limpiar();
                    
                }else{
                    JOptionPane.showMessageDialog(null, "No se pudo Agregar porque ya existe");
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "importante que todos los campos esten bien diligenciados. "
                        + "Sigue las siguientes recomendaciones para que sepas donde estas fallando: \n"
                        + "1. Es obligatorio escoger el tipo de trabajo. \n"
                        + "2. Las horas a necesarias no pueden ser menores a 0. \n"
                        + "3. El campo de Descripcion no puede estar vacio o que solo tenga espacios. \n"
                        + "Intentalo de nuevo.");
            }
        }else if(e.getSource()==vista1.blistar){
            System.out.println("Boton listar");
            for(Trabajo t: Principal.Principal.trabajos){
                System.out.println("id: "+ t.getId());
                System.out.println("Descripcion: "+t.getDescripcion());
                System.out.println("Horas trabajo: "+ t.getHorasTrabajo());
                System.out.println("Estado trabajo: "+ t.getEstadoTrabajo());
                System.out.println("Tipo Trabajo: "+t.getTipoTrabajo());
                System.out.println("Estado trabajo: "+t.getEstadoTrabajo());
                System.out.println("Descripcion trabajo : "+t.getDescripcion());
                System.out.println("Total trabajo : "+t.getPrecioTotal());
            }
        }
    }
    
    private Trabajo CrearTrabajo(int codigo, String descripcion, String tipoTrabajo, int horasTrabajo){
        
        System.out.println("Valor de codigo : "+codigo);
        Trabajo t;
        Revision r = new Revision();
        RLyP RL = new RLyP();
        RMecanica RM = new RMecanica();
        
        if(tipoTrabajo=="REVISION"){
            r.setId(codigo);
            r.setDescripcion(descripcion);
            r.setTipoTrabajo(tipoTrabajo);
            r.setHorasTrabajo(horasTrabajo);
            t = r;
        }else if(tipoTrabajo=="REPARACION MECANICA"){
            RM.setId(codigo);
            RM.setDescripcion(descripcion);
            RM.setTipoTrabajo(tipoTrabajo);
            RM.setHorasTrabajo(horasTrabajo);
            t = RM;
        }else{
            RL.setId(codigo);
            RL.setDescripcion(descripcion);
            RL.setTipoTrabajo(tipoTrabajo);
            RL.setHorasTrabajo(horasTrabajo);
            t = RL;
        }
       
        return t;
    }
    private


    void limpiar(){
        vista1.txthoras.setText("0");
        vista1.txtdescripcion.setText("");
        vista1.listaOpciones.setSelectedIndex(0);
    }
            
    
}
