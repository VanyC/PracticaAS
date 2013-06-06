/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DataInterface;

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
            // creamos la clase
        }
        return ctrlE;
    }
    
    public CtrlPacient getCtrlPacient(){
        if (ctrlP == null){
            // creamos la clase
        }
        return ctrlP;
    }
    
    public CtrlIngres getCtrlIngres(){
        if (ctrlI == null){
            // creamos la clase
        }
        return ctrlI;
    }
    
    public CtrlHospital getCtrlHospital(){
        if (ctrlH == null){
            // creamos la clase
        }
        return ctrlH;
    }
    
    public CtrlMetge getCtrlMetge(){
        if (ctrlM == null){
            // creamos la clase
        }
        return ctrlM;
    }
    
    public CtrlHabitacio getCtrlHabitacio(){
        if (ctrlHab == null){
            // creamos la clase
        }
        return ctrlHab;
    }
}
