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
    
    public int AgregarHora(int codigo, int horas){
        int resp = 1;
        if(Principal.trabajos.size()>=1){
            for(Trabajo o: Principal.trabajos){
                if(o.getId()==codigo){
                    if(o.getEstadoTrabajo()==0){
                        o.setHorasTrabajo(o.getHorasTrabajo()+horas);
                        resp=0;
                    }else{
                        //Trabjo finalizado
                     resp=3;   
                    }
                }else{
                  //No se encontro ningun registro
                  resp=2;
                }
            }
        }else{
            //no Hay datos
            resp=1;
        }
            
        
        return resp;
    }
    public int AgregarMaterial(int codigo, double material){
        int resp = 1;
        
        if(Principal.trabajos.size()>=1){
                for(Trabajo o: Principal.trabajos){
                    if(o.getId()==codigo && !(o.getTipoTrabajo()=="REVISION") ){
                        if( o.getEstadoTrabajo()==0 ){
                            o.setPrecioTrbajo(o.getPrecioTrbajo()+material);
                            resp=0;
                        }else{
                            //Trabajo ya finalizado
                            resp=3;
                        }   
                    }else{
                        //Es una revision o no se encontro
                     resp = 2;   
                    }
                }
            
        }else{
            //No hay datos
            return 1;
        }  
        
        return resp;
    }
    
    public int finalizarTrabajo(int codigo){
        int resp=1;
        if(Principal.trabajos.size()>=1){
            for(Trabajo o: Principal.trabajos){
                if(o.getId()==codigo){
                    if(o.estadoTrabajo==0){
                        o.setEstadoTrabajo(1);
                        o.setPrecioTotal(o.CalcularTrabajo());
                        resp=0;
                    }else{
                        resp =3;
                    }
                    
                }else{
                    resp = 2;
                }
            }
        }else{
            resp= 1;
        }
            
        
        return resp;
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
    
    public Trabajo resumenTrabajo(int codigo){
        
        
        Trabajo t= new Trabajo() {
            @Override
            public double CalcularTrabajo() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        if(Principal.trabajos.size()>=1){
            for(Trabajo o: Principal.trabajos){
                if(o.getId()==codigo){
                    t.setPrecioTotal(o.CalcularTrabajo());
                    t.setHorasTrabajo(o.getHorasTrabajo());
                    t.setDescripcion(o.getDescripcion());
                    t.setTipoTrabajo(o.getTipoTrabajo());
                    
                }
            }
        }
            
        
        return t;
    
    }
    
}
