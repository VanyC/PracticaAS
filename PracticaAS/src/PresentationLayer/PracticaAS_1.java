/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import DomainLayer.DomainModel.Especialitat;
import DomainLayer.DomainModel.Habitacio;
import DomainLayer.DomainModel.Hospital;
import DomainLayer.DomainModel.Ingres;
import DomainLayer.DomainModel.Metge;
import DomainLayer.DomainModel.Pacient;
import DomainLayer.DomainModel.Persona;
import DomainLayer.DomainModel.Sanitari;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author Vane
 */
public class PracticaAS_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //  Principal p = new Principal();
        //p.setVisible(true);
        Habitacio habitacio1 = new Habitacio();
        Habitacio habitacio2 = new Habitacio();
        Hospital hospital = new Hospital();
        
        hospital.setNom("San Pablo");
        hospital.setAdreça("Dos de mayo");
        hospital.setDescripcio("Hospital general, area maternoinfantil");
        
        habitacio1.getCompoundKeyHabitacio().sethospitalNom(hospital.getNom());
        habitacio1.getCompoundKeyHabitacio().setNumero(15);
            
        habitacio2.getCompoundKeyHabitacio().sethospitalNom(hospital.getNom());
        habitacio2.getCompoundKeyHabitacio().setNumero(3);
        
        ArrayList<Habitacio> habitacions = new ArrayList<Habitacio>();
        habitacions.add(habitacio1);
        habitacions.add(habitacio2);
        hospital.setHabitacions(habitacions);
        
        AnnotationConfiguration config = new AnnotationConfiguration();
        config.addAnnotatedClass(Hospital.class);
        config.addAnnotatedClass(Especialitat.class);
        config.addAnnotatedClass(Habitacio.class);
        config.addAnnotatedClass(Sanitari.class);
        config.addAnnotatedClass(Persona.class);
        config.addAnnotatedClass(Metge.class);
        config.addAnnotatedClass(Pacient.class);
        config.addAnnotatedClass(Ingres.class);
        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();
        new SchemaExport(config).create(true, true); 
        Session session = null;
        try {         
            session = factory.getCurrentSession();  
        } catch (org.hibernate.HibernateException he) {  
            session = factory.openSession();     
        } 
        session.beginTransaction();
        session.save(hospital);
        session.save(habitacio1);
        session.save(habitacio2);
        session.getTransaction().commit();
    }
}
