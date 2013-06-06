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
        if (dataAlta != null) return true;
        return false;
    }
    
    public void crearIngres(Hospital h, Habitacio hab, Pacient p, Date dat) throws Exception{
       /* Ingres i = new Ingres();
        i.hosp = h;
        i.hab = hab;
        i.dataInici = dat;*/
        boolean b = p.comprovarPacient();
        Ingres i = new Ingres();
        i.hosp = h;
        i.hab = hab;
        i.p = p;
        i.dataInici = dat;
        hab.vincula(i);
    }
    
    public boolean pacientIngressat(){
        if (dataAlta == null) return true;
        return false;
    }
    
    public void assignarMetge(Metge m,Hospital h) throws Exception{
        try{
            if (this.dataAlta != null) throw new Exception("altaIngres");
            if (this.hosp != h) throw new Exception("noHospitalIngres");
            String esp_hab = hab.getEspecialitatHabitacio();
            if (m != null) throw new Exception("ingresAmbMetge");
            String esp_met = m.getEspecialitatMetge();
            if (esp_hab != esp_met) throw new Exception("noCoincideixenEspecialitats");
            m.assignarIngres(this);
            this.m = m;
        }
        catch(Exception exc){
            System.out.println("Error: " + exc.getMessage());
        }
        
    }
}
