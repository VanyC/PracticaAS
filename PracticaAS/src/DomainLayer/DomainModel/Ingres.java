/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

import java.util.Date;

/**
 *
 * @author Sandra
 */
public class Ingres {
    private Date dataInici;
    private Date dataAlta;
    private Habitacio hab;
    private Hospital hosp;
    private Pacient p;
    private Metge m;
    
    public Ingres(){}
    
    public Date getDataInici(){
        return dataInici;
    }
    
    public Date getDataAlta(){
        return dataAlta;
    }
    
    public Habitacio getHabitacio(){
        return hab;
    }
    
    public Hospital getHospital(){
        return hosp;
    }
    
    public Pacient getPacient(){
        return p;
    }
    
    public Metge getMetge(){
        return m;
    }
    
    public void setDataInici(Date dat){
        this.dataInici = dat;
    }
    
    public void setDataAlta(Date dat){
        this.dataAlta = dat;
    }
    
    public void setHabitacio(Habitacio hab){
        this.hab = hab;
    }
    
    public void setHospital(Hospital h){
        this.hosp = h;
    }
    
    public void setMetge(Metge m){
        this.m = m;
    }
    
    public void setPacient(Pacient p){
        this.p = p;
    }
    
    public boolean comprovarHabitacioLliure(){
        if (dataAlta == null) return false;
        return true;
    }
    
    public void crearIngres(Hospital h, Habitacio hab, Date dat){
        Ingres i = new Ingres();
        i.hosp = h;
        i.hab = hab;
        i.dataInici = dat;
    }
    
    public boolean pacientIngressat(){
        if (dataAlta == null) return true;
        return false;
    }
    
    public void assignarMetge(Metge m,Hospital h){
        this.m = m;
        this.hosp = h;
    }
}
