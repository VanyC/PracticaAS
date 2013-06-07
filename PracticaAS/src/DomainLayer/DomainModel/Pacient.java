/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

import java.util.ArrayList;

/**
 *
 * @author Sandra
 */
public class Pacient extends Persona{
    private String nTS;
    private String email;
    private ArrayList<Ingres> ingres;
    
    public Pacient(){}
    
    public Pacient(String nTS, String email, ArrayList<Ingres> ingres){
        this.nTS = nTS;
        this.email = email;
        this.ingres = ingres;
    }
    
    public String getnTS(){
        return nTS;
    }
    
    public String getEmail(){
        return email;
    }
    
    public ArrayList<Ingres> getIngressos(){
        return ingres;
    }
    
    public void setnTS(String nTS){
        this.nTS = nTS;
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
