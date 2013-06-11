/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Sandra
 */
@Entity
public class Sanitari extends Persona implements Serializable{
    @Column(unique=true)
    private String codiEmpleat;
    private Hospital hosp;
    
    public String getCodiEmpleat(){
        return codiEmpleat;
    }
    
    public Hospital getHospital(){
        return hosp;
    }
    
    public void setCodiEmpleat(String codi){
        this.codiEmpleat = codi;
    }
    
    public void setHospital(Hospital h){
        this.hosp = h;
    }
}
