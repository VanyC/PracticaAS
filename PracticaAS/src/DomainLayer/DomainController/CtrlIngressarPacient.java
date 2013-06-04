/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainController;

import DomainLayer.DomainModel.InformesSanitatServAdapter;
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
    
    public void enviarInformeIngres(){
        //Pacient p = ControladorPacient.ins.getPacient(nTS);
        
        InformesSanitatServAdapter a = new InformesSanitatServAdapter();
        //a.cosa()
        a=null;
    }
}
