/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaas;

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
 * @author Vane
 */
@Entity
@Table(name = "hospital", catalog = "practicaas")
public class Hospital implements Serializable {
    @Id
    private String nom;
    @Column(name="adreca")
    private String adreca;
    @Column(name="descripcio")
    private String descripcio;

    @OneToMany(targetEntity=Habitacio.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "hospitalNom", referencedColumnName = "nom")
    private List<Habitacio> habitacions = new ArrayList<Habitacio>();
        
    public String getNom() {
        return nom;
    }

    public List<Habitacio> getHabitacions() {
        return habitacions;
    }

    public void setHabitacions(List<Habitacio> habitacions) {
        this.habitacions = habitacions;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }
}
