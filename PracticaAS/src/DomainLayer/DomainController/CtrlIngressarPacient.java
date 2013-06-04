/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainController;

import DomainLayer.DomainModel.InformesSanitatServAdapter;
import java.util.ArrayList;
/**
 *
 * @author Sandra
 */
public class CtrlIngressarPacient {
    private String nomEsp;
    private String nomH;
    private int numHab;
    private String nTS;
    private String dniM;
    
    public static class Hospitals{
        private static String nom;
        private static String adr;
        private static String desc;
        private static ArrayList<Integer> habLliu;
    }
    
    public void enviarInformeIngres(){
        //Pacient p = ControladorPacient.ins.getPacient(nTS);
        
        InformesSanitatServAdapter a = new InformesSanitatServAdapter();
        //a.cosa()
        a=null;
    }
    
    public ArrayList<Hospitals> obteHospitalsLliuresPerEspecialitat(String nomEsp){
        ArrayList<Hospitals> llist = new ArrayList<Hospitals>();
        return llist;
    }
}
