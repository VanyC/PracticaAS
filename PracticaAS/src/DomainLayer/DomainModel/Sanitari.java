/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

/**
 *
 * @author Sandra
 */
public class Sanitari extends Persona{
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
