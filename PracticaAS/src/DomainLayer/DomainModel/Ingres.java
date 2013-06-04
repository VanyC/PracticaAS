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
}
