/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sandra
 */
public class Habitacio {
    private int numero;
    private Especialitat e;
    private ArrayList<Ingres> ingres = new ArrayList<Ingres>();
    
    public int getNumHabitacio(){
        return numero;
    }
    
    public String getEspecialitatHabitacio(){
        return e.getNomEspecialitat();
    }
    
    public void vincula(Ingres i){
        ingres.add(i);
    }
    
    public boolean comprovarHabitacio(String nomEsp){
        boolean b = false;
        String ne = e.getNomEspecialitat();
        if (ne.equals(nomEsp)){
            for (Ingres i:ingres){
                b = i.comprovarHabitacioLliure();
            }
        }
        return b;
    }
}
