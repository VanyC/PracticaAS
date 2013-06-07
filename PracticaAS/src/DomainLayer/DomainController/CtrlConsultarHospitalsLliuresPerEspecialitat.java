/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainController;

import java.util.ArrayList;

import DomainLayer.DataInterface.CtrlDataFactoria;
import DomainLayer.DataInterface.CtrlEspecialitat;
import DomainLayer.DomainModel.Especialitat;
import DomainLayer.DomainModel.InfoHospital;
/**
 *
 * @author Roberto
 */
public class CtrlConsultarHospitalsLliuresPerEspecialitat {
    
    public ArrayList<InfoHospital> getHospitalsLliuresPerEspecialitat(String nomEsp){
        
        CtrlDataFactoria factoria = CtrlDataFactoria.getInstance();
        
        CtrlEspecialitat ce = factoria.getCtrlEspecialitat();
        Especialitat e = ce.getEspecialitat(nomEsp);
        
        ArrayList<InfoHospital> llistat = e.obteHospitalsLliures();
        
        return llistat;
    }
}
