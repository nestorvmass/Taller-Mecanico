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
    RLyP ObjetoMecanicaLatoneria = new RLyP();
    Revision ObjetoRevision = new Revision();
    
    public TrabajoDao (){
        
    }
    
    public boolean addTrabajo(Trabajo t){
        boolean primeravez=true;
        if(t.getId()==0 || primeravez==true){
            Principal.trabajos.add(t);
             System.out.println("objeto agregado exitosamente");
             primeravez=false;
            return true;
        }else{
            if(!BuscarId(t.getId())){
                Principal.trabajos.add(t); 
                System.out.println("objeto agregado exitosamente cuando id es mayor a 0");
                return true;
            }else{
                System.out.println("El Objeto no se agrego porque ya existe");
            }
        }
        return false;
    }
    
    public boolean AgregarHora(int codigo, int horas){
        
        for(Trabajo o: Principal.trabajos){
            if(o.getId()==codigo){
                //System.out.println("El codigo ya existe");
                o.setHorasTrabajo(o.getHorasTrabajo()+horas);
                return true;
            }else{
                //System.out.println("El codigo No existe");
            }
        }
        
        return false;
    }
    
    
    
    private boolean BuscarId(int codigo){
        System.out.println("BuscarId: Valor Codigo: "+codigo);  boolean resp = false;
        for(Trabajo o: Principal.trabajos){
            if(o.getId()==codigo){
                //System.out.println("El codigo ya existe");
                return true;
            }else{
                //System.out.println("El codigo No existe");
            }
        }
        return false;
    }
    
    
    
    
    
    public Trabajo buscarTrabajo(int codigo){
        Trabajo t = null;
        for(Trabajo o: Principal.trabajos){
            if(o.getId()==codigo){
                t.setId(o.getId());            }
                t.setHorasTrabajo(o.getHorasTrabajo());
            }
        
        return t;
    }
    
}
