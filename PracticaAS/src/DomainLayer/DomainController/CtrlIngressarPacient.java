/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainController;

import java.util.ArrayList;
import java.util.Date;
import DomainLayer.DataInterface.CtrlDataFactoria;
import DomainLayer.DataInterface.CtrlHospital;
import DomainLayer.DataInterface.CtrlHabitacio;
import DomainLayer.DataInterface.CtrlPacient;
import DomainLayer.DomainModel.InfoHospital;
import DomainLayer.DomainModel.InfoMetge;
import DomainLayer.DomainModel.Habitacio;
import DomainLayer.DomainModel.Hospital;
import DomainLayer.DomainModel.Pacient;
import DomainLayer.DomainModel.Ingres;
import DomainLayer.DomainModel.InformesSanitatServAdapter;

/**
 *
 * @author Sandra
 */
public class CtrlIngressarPacient {
    private String nomE;
    private String nomH;
    private int numH;
    private String nTS;
    private String dniM;
    private CtrlAssignarMetgeAUnIngres ctrlA;
    
    public ArrayList<InfoHospital> obteHospitalsLliuresPerEspecialitat(String nomEsp){
        
        CtrlConsultarHospitalsLliuresPerEspecialitat ctrlC = new CtrlConsultarHospitalsLliuresPerEspecialitat();
        ArrayList<InfoHospital> llistat = ctrlC.getHospitalsLliuresPerEspecialitat(nomEsp);
        
        nomE = nomEsp;
        
        return llistat;
    }
    
    public void creaIngres(String nomHosp, int numHab, String nTs){
        
        CtrlDataFactoria factoria = CtrlDataFactoria.getInstance();
        CtrlHospital ch = factoria.getCtrlHospital();
        CtrlHabitacio chab = factoria.getCtrlHabitacio();
        CtrlPacient cp = factoria.getCtrlPacient();
        
        Hospital h = ch.getHospital(nomHosp);
        Habitacio hab = chab.getHabitacio(numHab, nomHosp);
        Pacient p = cp.getPacient(nTs);
        
        Date data = new Date();
        Ingres i = new Ingres();
        i.crearIngres(h, hab, p, data);
        
        nomH = nomHosp;
        numH = numHab;
        nTS = nTs;
    }
    
    public ArrayList<InfoMetge> mostraMetgesPerEspecialitat(){
        // crear otro ctrl
        
        ctrlA = new CtrlAssignarMetgeAUnIngres();
        ArrayList<InfoMetge> metges = ctrlA.getMetgesHospitalPerEspecialitat(nomH, nomE);
        
        return metges;
    }
    
    public void assignarMetgeAInres(String dni){
        
        Date data = new Date();
        ctrlA.setMetgeAIngres(dni, nTS, data);
        
        dniM = dni;
    }
    
    public void enviarInformeIngres(){
        
        CtrlDataFactoria factoria = CtrlDataFactoria.getInstance();
        CtrlPacient cp = factoria.getCtrlPacient();
        Pacient p = cp.getPacient(nTS);
        
        String email = p.getEmail();
        
        Factoria f = Factoria.getInstance();
        InformeSanitatServAdapter iss = f.getInformeSanitatServ();
        
        Date dataAvui = new Date();
        
        iss.enviarInformeIngres(nomE, dataAvui, nomH, numH, nTS, dniM, email);
        
    }
    
}
