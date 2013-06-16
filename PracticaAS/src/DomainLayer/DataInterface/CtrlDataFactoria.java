/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DataInterface;

import DataLayer.CtrlEspecialitatBD;
import DataLayer.CtrlHabitacioBD;
import DataLayer.CtrlHospitalBD;
import DataLayer.CtrlIngresBD;
import DataLayer.CtrlMetgeBD;
import DataLayer.CtrlPacientBD;
/**
 *
 * @author Roberto
 */
public class CtrlDataFactoria {
    
    private static CtrlDataFactoria instance = null;
    CtrlEspecialitat ctrlE = null;
    CtrlPacient ctrlP = null;
    CtrlIngres ctrlI = null;
    CtrlHospital ctrlH = null;
    CtrlMetge ctrlM = null;
    CtrlHabitacio ctrlHab = null;
    
    private CtrlDataFactoria() {
        
    }
    
    public static CtrlDataFactoria getInstance() {
        if (instance == null) {
            instance = new CtrlDataFactoria();
        }
        return instance;
    }
    
    public CtrlEspecialitat getCtrlEspecialitat(){
        if (ctrlE == null){
            ctrlE = new CtrlEspecialitatBD();
        }
        return ctrlE;
    }
    
    public CtrlPacient getCtrlPacient(){
        if (ctrlP == null){
            ctrlP = new CtrlPacientBD();
        }
        return ctrlP;
    }
    
    public CtrlIngres getCtrlIngres(){
        if (ctrlI == null){
            ctrlI = new CtrlIngresBD();
        }
        return ctrlI;
    }
    
    public CtrlHospital getCtrlHospital(){
        if (ctrlH == null){
            ctrlH = new CtrlHospitalBD();
        }
        return ctrlH;
    }
    
    public CtrlMetge getCtrlMetge(){
        if (ctrlM == null){
            ctrlM = new CtrlMetgeBD();
        }
        return ctrlM;
    }
    
    public CtrlHabitacio getCtrlHabitacio(){
        if (ctrlHab == null){
            ctrlHab = new CtrlHabitacioBD();
        }
        return ctrlHab;
    }
}
