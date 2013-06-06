/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;
import java.util.ArrayList;
/**
 *
 * @author Roberto
 */
public class DadesHospital {
    String nom;
    String adreça;
    String descripcio;
    ArrayList<Integer> habLliures;
    
    public DadesHospital(String nomH, String adreçaH, String descripcioH, ArrayList<Integer> habLliuresH){
        nom = nomH;
        adreça = adreçaH;
        descripcio = descripcioH;
        habLliures = habLliuresH;
    }
    
    public String getNom(){
        return nom;
    }
    
    public String getAdreça(){
        return adreça;
    }
    
    public String getDescripcio(){
        return descripcio;
    }
    
    public ArrayList<Integer> getHabLliures(){
        return habLliures;
    }
    
    public void setNom(String nomH){
        nom = nomH;
    }
    
    public void setAdreça(String adreçaH){
        adreça = adreçaH;
    }
    
    public void setDescripcio(String descripcioH){
        descripcio = descripcioH;
    }
    
    public void addHabLliure(int num){
        habLliures.add(num);
    }
    
    public void mergeHabLliure(ArrayList<Integer> habLliuresH){
        habLliures.addAll(habLliuresH);
    }
    
}
