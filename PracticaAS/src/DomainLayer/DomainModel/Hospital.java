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
public class Hospital {
    private String nom;
    private String adreça;
    private String descripcio;
    private ArrayList<Sanitari> sanitari;
    private ArrayList<Especialitat> esp;
    private ArrayList<Habitacio> hab;
    
    public Hospital(){}
    
    public String getNom(){
        return nom;
    }
    
    public String getAdreça(){
        return adreça;
    }
    
    public String getDescripcio(){
        return descripcio;
    }
    
    public ArrayList<Sanitari> getSanitaris(){
        return sanitari;
    }
    
    public ArrayList<Especialitat> getEspecialitats(){
        return esp;
    }
    
    public ArrayList<Habitacio> getHabitacions(){
        return hab;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public void setAdreça(String adr){
        this.adreça = adr;
    }
    
    public void setSanitaris(ArrayList<Sanitari> san){
        this.sanitari = san;
    }
    
    public void setEspecialitats(ArrayList<Especialitat> esp){
        this.esp = esp;
    }
    
    public void setHabitacions(ArrayList<Habitacio> hab){
        this.hab = hab;
    }
    
    public boolean obteHospitalsLliures(String nomEsp){
        boolean b = false;
        for (Habitacio h:hab){
            b = h.comprovarHabitacio(nomEsp);
            if (b == true) {
                
            }
        }
        return b;
    }
    
    public ArrayList<InfoMetge> obteMetgesEspecialitat(String nomEsp) throws Exception{
        ArrayList<InfoMetge> dm = new ArrayList<InfoMetge>();
        try{
            for (Especialitat e: esp){
                boolean b = e.teEspecialitat(nomEsp);
                if (b == false) throw new Exception("noEspecialitatEnHospital");
                //ArrayList<InfoMetge> dm = 
            }
            
        }
        catch(Exception exc){
            System.out.println("Error: " + exc.getMessage());
        }
        return dm;
        
    }
}
