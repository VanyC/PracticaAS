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
