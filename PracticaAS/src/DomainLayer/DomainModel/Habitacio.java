/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Sandra
 */
@Entity
@Table(name = "habitacio", catalog = "practicaas")
public class Habitacio  implements Serializable {
    
     @EmbeddedId
    CompoundKeyHabitacio compoundkey = new CompoundKeyHabitacio();
    @OneToMany(targetEntity=Ingres.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "numHab", referencedColumnName = "numero") 
    private ArrayList<Ingres> ingres = new ArrayList<Ingres>();
    @Column(name="nomEsp")
    private Especialitat e;
    
    public Habitacio(){}
    
    public CompoundKeyHabitacio getCompoundKeyHabitacio(){
        return compoundkey;
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
