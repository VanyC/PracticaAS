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
public class Metge extends Sanitari{
    private String categoria;
    private Especialitat e;
    private ArrayList<Ingres> ingres;
    
    public String getCategoria(){
        return categoria;
    }
    
    public Especialitat getEspecialitat(){
        return e;
    }
    
    public ArrayList<Ingres> getIngressos(){
        return ingres;
    }
    
    public void setCategoria(String cat){
        this.categoria = cat;
    }
    
    public void setIngressos(ArrayList<Ingres> i){
        this.ingres = i;
    }
    
    public InfoMetge obteDades(){
        InfoMetge dm = new InfoMetge();
        InfoPersona dp = this.obteDadesPersona();
        dm.dni = dp.dni;
        dm.nom = dp.nom;
        dm.cat = this.categoria;
        return dm;
    }
    
    public String getEspecialitatMetge(){
        return e.getNomEspecialitat();
    }
    
    public void assignarIngres(Ingres i){
        ingres.add(i);
    }
}
