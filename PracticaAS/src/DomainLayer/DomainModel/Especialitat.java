/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Sandra
 */
@Entity
@Table(name = "especialitat", catalog = "practicaas")
public class Especialitat {
    @Id
    private String nom;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "EspecialitatHospital", 
            joinColumns = { @JoinColumn(name = "especialitatNom") }, inverseJoinColumns = { @JoinColumn(name = "hospitalNom") })
    private ArrayList<Hospital> hosp;        
    @ManyToOne(targetEntity=Habitacio.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "nomEsp", referencedColumnName = "nom")
    private ArrayList<Habitacio> hab;
    @ManyToOne(targetEntity=Metge.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "nomEsp", referencedColumnName = "nom")
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
        InfoHospital ih = new InfoHospital();
        boolean b = false;
        for(Hospital h:hosp){
            b = h.obteHospitalsLliures(nom, ih);
            if (b == true)dh.add(ih);
        }
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
