/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import DomainLayer.DataInterface.CtrlIngres;
import DomainLayer.DomainModel.CompoundKeyHabitacio;
import DomainLayer.DomainModel.CompoundKeyIngres;
import DomainLayer.DomainModel.Especialitat;
import DomainLayer.DomainModel.Ingres;
import java.util.Date;
import org.hibernate.Session;

/**
 *
 * @author Vane
 */
public class CtrlIngresBD implements CtrlIngres{

    @Override
    public Ingres getIngres(String nTs, Date date) {
        CtrlDataFactoriaBD factoria = CtrlDataFactoriaBD.getInstance();
        Session session = factoria.getSession();
        session.beginTransaction();
        CompoundKeyIngres cki = new CompoundKeyIngres(date, nTs);
        Ingres ingres = (Ingres) session.get(Ingres.class, cki);
        session.getTransaction().commit();
        cki = null;
        return ingres;
    }
    
}
