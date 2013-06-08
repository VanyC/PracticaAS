/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import DomainLayer.DataInterface.CtrlMetge;
import DomainLayer.DomainModel.CompoundKeyHabitacio;
import DomainLayer.DomainModel.Habitacio;
import DomainLayer.DomainModel.Metge;
import org.hibernate.Session;

/**
 *
 * @author Vane
 */
public class CtrlMetgeBD implements CtrlMetge{

    @Override
    public Metge getMetge(String dni) {
        CtrlDataFactoriaBD factoria = CtrlDataFactoriaBD.getInstance();
        Session session = factoria.getSession();
        session.beginTransaction();
        Metge metge = (Metge) session.get(Metge.class, dni);
        session.getTransaction().commit();
        return metge;
    }
    
}
