/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainController;

import java.util.ArrayList;
import java.util.Date;
import DomainLayer.DataInterface.CtrlDataFactoria;
import DomainLayer.DataInterface.CtrlHospital;
import DomainLayer.DataInterface.CtrlEspecialitat;
import DomainLayer.DataInterface.CtrlIngres;
import DomainLayer.DataInterface.CtrlMetge;
import DomainLayer.DomainModel.InfoMetge;
import DomainLayer.DomainModel.Hospital;
import DomainLayer.DomainModel.Ingres;
import DomainLayer.DomainModel.Metge;


/**
 *
 * @author Roberto
 */
public class CtrlAssignarMetgeAUnIngres {
    private String nomH;
    private String nomE;
    
    public ArrayList<InfoMetge> getMetgesHospitalPerEspecialitat(String nomHosp, String nomEsp) throws Exception{
        
        CtrlDataFactoria factoria = CtrlDataFactoria.getInstance();
        
        CtrlHospital ch = factoria.getCtrlHospital();
        CtrlEspecialitat ce = factoria.getCtrlEspecialitat();
        Hospital h = ch.getHospital(nomHosp);
        
        if (!ce.existeixEspecialitat(nomEsp)){
            throw new Exception("noHiHaEspecialitat");
        }
        
        ArrayList<InfoMetge> llistat = h.obteMetgesEspecialitat(nomEsp);
        nomH = nomHosp;
        nomE = nomEsp;
        
        return llistat;
    }
    
    public void setMetgeAIngres(String dni, String nTs, Date dataIni) throws Exception{
        
        CtrlDataFactoria factoria = CtrlDataFactoria.getInstance();
        
        CtrlIngres ci = factoria.getCtrlIngres();
        CtrlHospital ch = factoria.getCtrlHospital();
        CtrlMetge cm = factoria.getCtrlMetge();
        
        Ingres i = ci.getIngres(nTs,dataIni);
        Hospital h = ch.getHospital(nomH);
        Metge m = cm.getMetge(dni);
        try{
            i.assignarMetge(m,h);
        }
        catch(Exception exc){
            throw exc;
        }
        
        
    }
}