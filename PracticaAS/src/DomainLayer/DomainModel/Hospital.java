/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Entity;

/**
 *
 * @author Sandra
 */
@Entity
@Table(name = "hospital", catalog = "practicaas")
public class Hospital implements Serializable {
      @Id
    private String nom;
      @Column(name="adreca")
    private String adreça;
      @Column(name="descripcio")
    private String descripcio;
    private ArrayList<Sanitari> sanitari;
    private ArrayList<Especialitat> esp;
    @OneToMany(targetEntity=Habitacio.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "hospitalNom", referencedColumnName = "nom")
    private List<Habitacio> hab;
    
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
    
    public List<Habitacio> getHabitacions(){
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
        for (Especialitat e: esp){
            boolean b = e.teEspecialitat(nomEsp);
            if (b == false) throw new Exception("noEspecialitatEnHospital");
            //ArrayList<InfoMetge> dm = 
        }
        return dm;
        
    }
}
