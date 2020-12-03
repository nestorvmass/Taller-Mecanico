/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Modelo.*;
import Vista.*;
import Controlador.*;
import java.util.ArrayList;

/**
 *
 * @author ness
 */
public class Principal {
    public ArrayList<Trabajo> trabajos = new ArrayList<Trabajo>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Vista pantalla = new Vista();
        VRegistrarTrabajo vista1 = new VRegistrarTrabajo();
        VAumentarHoras vista2 = new VAumentarHoras();
        ControladorPricipal controlGeneral = new ControladorPricipal(pantalla, vista1, vista2);
        pantalla.setVisible(true);
        Revision o = new Revision();
        
        o.setDescripcion("Hola como estas");
        o.setHorasTrabajo(10);
        o.setConsecutivo();
        o.setConsecutivo();
        o.getPrecioFijo();
        System.out.println("consecutivo: "+o.getConsecutivo());
        System.out.println("Estado: "+ o.getEstadoTrabajo());
        System.out.println("Precio Fijo: "+o.CalcularTrabajo());
      
        
    }
    
}
