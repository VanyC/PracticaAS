/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author Sandra
 */
@Entity
@Table(name = "hospital", catalog = "practicaas")
public class Hospital implements Serializable {
      @Id
    private String nom;
      @Column(name="adreca")
    private String adreça;
      @Column(name="descripcio")
    private String descripcio;
    private ArrayList<Sanitari> sanitari;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "EspecialitatHospital", 
            joinColumns = { @JoinColumn(name = "especialitatNom") }, 
            inverseJoinColumns = { @JoinColumn(name = "hospitalNom") })
    private List<Especialitat> esp;
    @OneToMany(targetEntity=Habitacio.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "hospitalNom", referencedColumnName = "nom")
    private List<Habitacio> hab;
    
    public Hospital(){}
    
    public String getNom(){
        return nom;
    }
    
    public String getAdreça(){
        return adreça;
    }
    
    public String getDescripcio(){
        return descripcio;
    }
    
    public ArrayList<Sanitari> getSanitaris(){
        return sanitari;
    }
    
    public List<Especialitat> getEspecialitats(){
        return esp;
    }
    
    public List<Habitacio> getHabitacions(){
        return hab;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public void setAdreça(String adr){
        this.adreça = adr;
    }
    
    public void setSanitaris(ArrayList<Sanitari> san){
        this.sanitari = san;
    }
    
    public void setEspecialitats(ArrayList<Especialitat> esp){
        this.esp = esp;
    }
    
    public void setHabitacions(ArrayList<Habitacio> hab){
        this.hab = hab;
    }
    
    public boolean obteHospitalsLliures(String nomEsp, InfoHospital tupla){
        boolean b = false;
        CompoundKeyHabitacio ch;
        tupla = new InfoHospital();
        for (Habitacio h:hab){
            b = h.comprovarHabitacio(nomEsp);
            if (b == true) {
                ch = h.getCompoundKeyHabitacio();
                Integer num = ch.getNumero();
                tupla.hab.add(num);
            }
            if(tupla.hab.size()!=0){
                tupla.nom = this.nom;
                tupla.adreça = this.adreça;
                tupla.descripcio = this.descripcio;
            }
        }
        return b;
    }
    
    public ArrayList<InfoMetge> obteMetgesEspecialitat(String nomEsp) throws Exception{
        ArrayList<InfoMetge> dm = new ArrayList<InfoMetge>();
        for (Especialitat e: esp){
            boolean b = e.teEspecialitat(nomEsp);
            if (b == false) throw new Exception("noEspecialitatEnHospital");
            dm = e.obteMetges();
            if (dm.size() == 0) throw new Exception("NoHiHaMetges");
        }
        sort(dm);
        return dm;
        
    }

    public void sort(ArrayList<InfoMetge> dm){
        final int N = dm.size();
        quicksort(dm,0,N-1);
    }
    
    public void quicksort(ArrayList<InfoMetge> dm, int inici, int fi){
        if(inici>=fi) return ;
        String pivote = dm.get(inici).nom;
        int izq    = inici+1;
        int der    = fi;
        while(izq<=der) {
            while(izq<=fi   && ((dm.get(izq).nom.compareTo(pivote))<0)) izq++;
            while(der>inici && ((dm.get(der).nom.compareTo(pivote))>0)) der--;
            if(izq<der) {
                InfoMetge tmp = dm.get(izq);
                dm.set((izq),dm.get(der));
                dm.set((der), tmp);
            }
        }
        if(der>inici) {
            InfoMetge tmp = dm.get(inici);
            dm.set(inici,dm.get(der));
            dm.set((der), tmp);
        }
        quicksort(dm,inici, der-1);
        quicksort(dm, der+1, fi);
    }
    
    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }
}
