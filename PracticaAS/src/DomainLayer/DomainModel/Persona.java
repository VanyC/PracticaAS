/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author Sandra
 */
@Entity
@Table(name = "persona", catalog = "practicaas")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Persona implements Serializable{
    @Id
    private String dni;
    private String nom;
    
    public Persona(){}
    
    public String getDni(){
        return dni;
    }
    
    public String getNom(){
        return nom;
    }
    
    public void setDni(String dni){
        this.dni = dni;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public InfoPersona obteDadesPersona(){
        InfoPersona dp = new InfoPersona();
        dp.dni = this.dni;
        dp.nom = this.nom;
        return dp;
    }
}
