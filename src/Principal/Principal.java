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
        VAumentarMateriales vista3 = new VAumentarMateriales();
        VFinalizarTrabajo vista4 = new VFinalizarTrabajo();
        VResumenTrabajo vista5 = new VResumenTrabajo();
        ControladorPricipal controlGeneral = new ControladorPricipal(pantalla, vista1, vista2, vista3, vista4, vista5);
        pantalla.setVisible(true);


      
        
    }
    
}
