/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import DomainLayer.DataInterface.CtrlEspecialitat;
import DomainLayer.DomainModel.Especialitat;
import DomainLayer.DomainModel.Pacient;
import org.hibernate.Session;

/**
 *
 * @author Vane
 */
public class CtrlEspecialitatBD implements CtrlEspecialitat{
    
    @Override
    public Especialitat getEspecialitat(String nomEsp) {
        CtrlDataFactoriaBD factoria = CtrlDataFactoriaBD.getInstance();
        Session session = factoria.getSession();
        session.beginTransaction();
        Especialitat especialitat = (Especialitat) session.get(Especialitat.class, nomEsp);
        session.getTransaction().commit();
        return especialitat;
    }

    @Override
    public Boolean existeixEspecialitat(String nomEsp) {
        CtrlDataFactoriaBD factoria = CtrlDataFactoriaBD.getInstance();
        Session session = factoria.getSession();
        session.beginTransaction();
        Especialitat especialitat = (Especialitat) session.get(Especialitat.class, nomEsp);
        session.getTransaction().commit();
        return (especialitat != null);        
    }
    
}
