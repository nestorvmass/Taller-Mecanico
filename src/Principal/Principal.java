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
    /**
     * @param args the command line arguments
     */
    public static ArrayList<Trabajo> trabajos = new ArrayList<Trabajo>();

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vista pantalla = new Vista();
        VRegistrarTrabajo vista1 = new VRegistrarTrabajo();
        VAumentarHoras vista2 = new VAumentarHoras();
        ControladorPricipal controlGeneral = new ControladorPricipal(pantalla, vista1, vista2);
        pantalla.setVisible(true);
        Revision o = new Revision();
        /*
        o.setDescripcion("Hola como estas");
        o.setHorasTrabajo(10);
        //o.setConsecutivo();
        o.setId(Trabajo.dameConsecutivo());
        o.setConsecutivo();
        o.getPrecioFijo();
        TrabajoDao tDao = new TrabajoDao();
       trabajos.add(o);
        System.out.println(o.toString());*/
        System.out.println("consecutivo: "+o.getConsecutivo());
        System.out.println("consecutivo: "+o.getConsecutivo());
        System.out.println("Estado: "+ o.getEstadoTrabajo());
        System.out.println("Precio Fijo: "+o.CalcularTrabajo());
      
        
    }
    
}
