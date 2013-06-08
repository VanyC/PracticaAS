/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import DomainLayer.DataInterface.CtrlHospital;
import DomainLayer.DomainModel.Hospital;
import org.hibernate.Session;

/**
 *
 * @author Vane
 */
public class CtrlHospitalBD implements CtrlHospital{
    
    public Hospital getHospital(String nomHosp) {
        
        CtrlDataFactoriaBD factoria = CtrlDataFactoriaBD.getInstance();
        Session session = factoria.getSession();
        session.beginTransaction();
        Hospital hospital = (Hospital) session.get(Hospital.class, nomHosp);
        session.getTransaction().commit();
        return hospital;
        
    }
    
}
