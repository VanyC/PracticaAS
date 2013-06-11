/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

import DomainLayer.DomainController.CtrlConsultarHospitalsLliuresPerEspecialitat;
import DomainLayer.DomainController.CtrlIngressarPacient;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.Transient;

/**
 *
 * @author Sandra
 */
@Entity
public class Ingres implements Serializable {
    @EmbeddedId
    private CompoundKeyIngres cki;    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataAlta;
    
     @OneToOne(targetEntity=Habitacio.class, fetch = FetchType.EAGER)
     @JoinColumns( {
        @JoinColumn(name = "numHab", referencedColumnName = "numero"),
        @JoinColumn(name = "nomHosp", referencedColumnName = "hospitalNom")
    })
    private CompoundKeyHabitacio hab;
     
    @Transient
    private Hospital hosp;
    @Transient
    private Habitacio insHabitacio;
 
    @OneToOne(targetEntity=Pacient.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "nTsPacient",referencedColumnName="nTs")
    private String nTsPacient;
    
    @OneToOne(targetEntity=Metge.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "dniMetge",nullable=true,referencedColumnName="dni")
    private String dniMetge;

    public Ingres() {
    }
    
    public Ingres(Date dataInici, String nTs){
        cki = new CompoundKeyIngres(dataInici, nTs);
    }
    
    public Date getDataInici(){
        return cki.getDataInici();
    }
    
    public Date getDataAlta(){
        return dataAlta;
    }

    public Hospital getHospital(){
        return hosp;
    }
    
    public String getPacient(){
        return nTsPacient;
    }
    
    public String getMetge(){
        return dniMetge;
    }
    
    public void setDataInici(Date dat){
        this.cki.setDataInici(dat);
    }
    
    public void setDataAlta(Date dat){
        this.dataAlta = dat;
    }
    
    public void setHospital(Hospital h){
        this.hosp = h;
    }
    
    public void setMetge(String m){
        this.dniMetge = m;
    }
    
    public void setPacient(String p){
        this.nTsPacient = p;
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
        i.hab.setNumero(hab.getCompoundKeyHabitacio().getNumero());
        i.hab.sethospitalNom(hab.getCompoundKeyHabitacio().gethospitalNom());
        insHabitacio=hab;
        i.nTsPacient = p.getnTS();
        i.cki.setDataInici(dat);
        hab.vincula(i);
    }
    
    public boolean pacientIngressat(){
        if (dataAlta == null) return true;
        return false;
    }
    
    public void assignarMetge(Metge m,Hospital h) throws Exception{
        if (this.dataAlta != null) throw new Exception("altaIngres");
        if (this.hosp != h) throw new Exception("noHospitalIngres");
        String esp_hab =  insHabitacio.getEspecialitatHabitacio();
        if (m != null) throw new Exception("ingresAmbMetge");
        String esp_met = m.getEspecialitatMetge();
        if (esp_hab != esp_met) throw new Exception("noCoincideixenEspecialitats");
        m.assignarIngres(this);
        this.dniMetge = m.getDni();
   }

    public CompoundKeyIngres getCki() {
        return cki;
    }

    public void setCki(CompoundKeyIngres cki) {
        this.cki = cki;
    }
}
