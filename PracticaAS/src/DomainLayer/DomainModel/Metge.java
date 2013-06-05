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
public class Metge extends Sanitari{
    private String categoria;
    private Especialitat e;
    private ArrayList<Ingres> ingres;
    
    //obteDades
    
    public String getEspecialitatMetge(){
        return e.getNomEspecialitat();
    }
    
    public void assignarIngres(Ingres i){
        ingres.add(i);
    }
}
