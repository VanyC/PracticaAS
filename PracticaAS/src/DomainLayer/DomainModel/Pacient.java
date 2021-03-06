/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Sandra
 */
@Entity
public class Pacient extends Persona implements Serializable{
     @Column(unique=true, name="nTs")
    private String nTs;
    private String email;
    private ArrayList<Ingres> ingres;
    
    public Pacient(){}
    
    public Pacient(String nTS, String email, ArrayList<Ingres> ingres){
        this.nTs = nTS;
        this.email = email;
        this.ingres = ingres;
    }
    
    public String getnTS(){
        return nTs;
    }
    
    public String getEmail(){
        return email;
    }
    
    public ArrayList<Ingres> getIngressos(){
        return ingres;
    }
    
    public void setnTS(String nTS){
        this.nTs = nTS;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setIngressos(ArrayList<Ingres> ingres){
        this.ingres = ingres;
    }
    
    public boolean comprovarPacient() throws Exception{
        boolean b = false;
        for (Ingres i:ingres){
            b = i.pacientIngressat();
        }
        if(b==true) throw new Exception("PacientIngressat");
        
        return b;
    }
}
