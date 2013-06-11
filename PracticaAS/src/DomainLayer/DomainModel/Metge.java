/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Sandra
 */
@Entity
public class Metge extends Sanitari implements Serializable{
    
    private String categoria;
    @OneToOne(targetEntity=Especialitat.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "nomEspecialitat",nullable=true,referencedColumnName="nom")
    private String nomEspecialitat;
    private ArrayList<Ingres> ingres;
    
    public String getCategoria(){
        return categoria;
    }
        
    public ArrayList<Ingres> getIngressos(){
        return ingres;
    }
    
    public void setCategoria(String cat){
        this.categoria = cat;
    }
    
    public void setIngressos(ArrayList<Ingres> i){
        this.ingres = i;
    }
    
    public InfoMetge obteDades(){
        InfoMetge dm = new InfoMetge();
        InfoPersona dp = this.obteDadesPersona();
        dm.dni = dp.dni;
        dm.nom = dp.nom;
        dm.cat = this.categoria;
        return dm;
    }
    
    public String getEspecialitatMetge(){
        return nomEspecialitat;
    }
    
    public void assignarIngres(Ingres i){
        ingres.add(i);
    }
}
