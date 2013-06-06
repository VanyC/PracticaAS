/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

import java.util.ArrayList;

/**
 *
 * @author Sandra
 */
public class Especialitat {
    private String nom;
    private ArrayList<Hospital> hosp;
    private ArrayList<Habitacio> hab;
    private ArrayList<Metge> metg;
    
    public Especialitat(){}
    
    public String getNomEspecialitat(){
        return nom;
    }
    
    public boolean teEspecialitat(String nomEsp){
        if (nomEsp.equals(nom)) return true;
        return false;
    }
    
    public ArrayList<InfoHospital> obteHospitalsLliures(){
        ArrayList<InfoHospital> dh = new ArrayList<InfoHospital>();
        for(Hospital h:hosp){
            
        }
        return dh;
    }
    
    //public obteMetges():TupleType(dni:string,nom:String,categoria:String)
}
