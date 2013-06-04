/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainController;

import java.util.ArrayList;

/**
 *
 * @author Sandra
 */
public class CtrlConsultarHospitalsLliuresPerEspecialitat {
    public static class Hospitals{
        private static String nom;
        private static String adr;
        private static String desc;
        private static ArrayList<Integer> habLliu;
    }
    
    public ArrayList<Hospitals> getHospitalsLliuresPerEspecialitat(String nomEsp){
        ArrayList<Hospitals> llist = new ArrayList<Hospitals>();
        return llist;
    }
}
