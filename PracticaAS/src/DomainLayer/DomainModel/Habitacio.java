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
import javax.persistence.OneToOne;
import javax.persistence.Transient;

/**
 *
 * @author Sandra
 */
@Entity
@Table(name = "habitacio", catalog = "practicaas")
public class Habitacio  implements Serializable {
    @EmbeddedId
    CompoundKeyHabitacio compoundkey = new CompoundKeyHabitacio();
    @Transient 
    private ArrayList<Ingres> ingres = new ArrayList<Ingres>();
    @OneToOne(targetEntity=Especialitat.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "nomEspecialitat",nullable=true,referencedColumnName="nom")
    private String nomEspecialitat;
    
    public Habitacio(){}
    
    public CompoundKeyHabitacio getCompoundKeyHabitacio(){
        return compoundkey;
    }
    
    public String getEspecialitatHabitacio(){
        return nomEspecialitat;
    }
    
    public void vincula(Ingres i){
        ingres.add(i);
    }
    
    public boolean comprovarHabitacio(String nomEsp){
        boolean b = false;
        String ne = nomEspecialitat;
        if (ne.equals(nomEsp)){
            for (Ingres i:ingres){
                b = i.comprovarHabitacioLliure();
            }
        }
        return b;
    }
}
