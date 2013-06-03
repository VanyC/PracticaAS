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
    
    public String getNomEspecialitat(){
        return nom;
    }
    
    public boolean teEspecialitat(String nomEsp){
        if (nomEsp.equals(nom)) return true;
        return false;
    }
}
