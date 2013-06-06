/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

/**
 *
 * @author Roberto
 */
public class DadesMetge {
    String dni;
    String nom;
    String categoria;
    
    public DadesMetge(String dniMetge, String nomMetge, String categoriaMetge){
        dni = dniMetge;
        nom = nomMetge;
        categoria = categoriaMetge;
    }
    
    public String getDni(){
        return dni;
    }
    
    public String getNom(){
        return nom;
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    public void setDni(String dniMetge){
        dni = dniMetge;
    }
    
    public void setNom(String nomMetge){
        nom = nomMetge;
    }
    
    public void setCategoria(String categoriaMetge){
        categoria = categoriaMetge;
    }
}
