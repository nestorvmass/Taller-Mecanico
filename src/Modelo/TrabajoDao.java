/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Principal.Principal;

/**
 *
 * @author ness
 */
public class TrabajoDao {
    RMecanica ObjetoMecanica = new RMecanica();
    Revision ObjetoRevision = new Revision();
    
    public TrabajoDao (){
        
    }
    
    public void CrearTrabajo(int codigo, String descripcion, String tipoTrabajo){
        if(codigo>=1){
            if(!BuscarId(codigo)){
            if(tipoTrabajo=="Revision"){
                System.out.println("Es una rei");
            }
            }else{
                System.out.println("ni verga");
            }
        }else{
            
        }
        
    }
    
    private boolean BuscarId(int codigo){
        boolean resp = false;
        for(Trabajo o: Principal.trabajos){
            if(o.getId()==codigo){
                System.out.println("El codigo ya existe");
                return true;
            }else{
                Principal.trabajos.add(o);
                System.out.println("El codigo No existe");

            }
        }
        return resp;
    }
    
}
