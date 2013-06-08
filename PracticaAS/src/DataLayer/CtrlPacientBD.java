/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import DomainLayer.DataInterface.CtrlPacient;
import DomainLayer.DomainModel.Metge;
import DomainLayer.DomainModel.Pacient;
import org.hibernate.Session;

/**
 *
 * @author Vane
 */
public class CtrlPacientBD implements CtrlPacient{

    @Override
    public Pacient getPacient(String nTs) {
        CtrlDataFactoriaBD factoria = CtrlDataFactoriaBD.getInstance();
        Session session = factoria.getSession();
        session.beginTransaction();
        Pacient pacient = (Pacient) session.get(Pacient.class, nTs);
        session.getTransaction().commit();
        return pacient;
    }
    
}
