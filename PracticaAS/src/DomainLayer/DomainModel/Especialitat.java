/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Sandra
 */
@Entity
@Table(name = "especialitat", catalog = "practicaas")
public class Especialitat {
    @Id
    private String nom;
    private int numHab;
    
    @Transient
    private List<Hospital> hosp;   
    
    @Transient
    private List<Habitacio> hab;
 
    @Transient
    private List<Metge> metg;
    
    public Especialitat(){}
    
    public String getNomEspecialitat(){
        return nom;
    }
    
    public boolean teEspecialitat(String nomEsp){
        if (nomEsp.equals(nom)) return true;
        return false;
    }
    
    public ArrayList<InfoHospital> obteHospitalsLliures() throws Exception{
        ArrayList<InfoHospital> dh = new ArrayList<InfoHospital>();
        InfoHospital ih = new InfoHospital();
        boolean b = false;
        for(Hospital h:hosp){
            b = h.obteHospitalsLliures(nom, ih);
            if (b == true)dh.add(ih);
        }
        if (dh.size()!=0) throw new Exception("NoHiHaHospitals");
        return dh;
    }
    
    public ArrayList<InfoMetge> obteMetges(){
        ArrayList<InfoMetge> dm = new ArrayList<InfoMetge>();
        InfoMetge mtg;
        for (Metge m: metg){
            mtg = m.obteDades();
            dm.add(mtg);
        }
        return dm;        
    }
}
