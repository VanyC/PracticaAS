/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import DomainLayer.DataInterface.CtrlHabitacio;
import DomainLayer.DataInterface.CtrlHospital;
import DomainLayer.DomainModel.CompoundKeyHabitacio;
import DomainLayer.DomainModel.Habitacio;
import DomainLayer.DomainModel.Hospital;
import org.hibernate.Session;

/**
 *
 * @author Vane
 */
public class CtrlHabitacioBD implements CtrlHabitacio{

    @Override
    public Habitacio getHabitacio(int numHab, String nomH) {
        CtrlDataFactoriaBD factoria = CtrlDataFactoriaBD.getInstance();
        Session session = factoria.getSession();
        session.beginTransaction();
        CompoundKeyHabitacio ckv = new CompoundKeyHabitacio(numHab, nomH);
        Habitacio habitacio = (Habitacio) session.get(Habitacio.class, ckv);
        session.getTransaction().commit();
        ckv = null;
        return habitacio;
    }
    
}
