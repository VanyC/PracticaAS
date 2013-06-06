/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

/**
 *
 * @author Sandra
 */
public class Persona {
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
