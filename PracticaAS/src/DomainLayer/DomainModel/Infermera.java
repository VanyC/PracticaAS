/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

/**
 *
 * @author Sandra
 */
public class Infermera extends Sanitari{
    private String torn;
    
    public Infermera(){}
    
    public String getTorn(){
        return torn;
    }
    
    public void setTorn(String torn){
        this.torn = torn;
    }
}
