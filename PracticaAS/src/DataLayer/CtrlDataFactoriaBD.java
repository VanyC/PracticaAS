/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

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

/**
 *
 * @author Vane
 */
public class CtrlDataFactoriaBD {
    
    public static CtrlDataFactoriaBD instance;
    private CtrlHospitalBD ctrlHospital = new CtrlHospitalBD();
    private CtrlEspecialitatBD ctrlEspecialitat = new CtrlEspecialitatBD();
    private CtrlHabitacioBD ctrlHabitacio = new CtrlHabitacioBD();
    private CtrlIngresBD ctrlIngres = new CtrlIngresBD();
    private CtrlMetgeBD ctrlMetge = new CtrlMetgeBD();
    private CtrlPacientBD ctrlPacient = new CtrlPacientBD();
    
    private Session session;
    
    public CtrlDataFactoriaBD() {
        AnnotationConfiguration config = new AnnotationConfiguration();
        config.addAnnotatedClass(Hospital.class);
        config.addAnnotatedClass(Especialitat.class);
        config.addAnnotatedClass(Habitacio.class);
        config.addAnnotatedClass(Ingres.class);
        config.addAnnotatedClass(Metge.class);
        config.addAnnotatedClass(Pacient.class);
        config.addAnnotatedClass(Persona.class);
        config.addAnnotatedClass(Sanitari.class);
        try{
            config.configure("hibernate.cfg.xml");
            //new SchemaExport(config).create(true, true); 
            SessionFactory factory = config.buildSessionFactory(); 
            Session sess = null;       
            try {         
                sess = factory.getCurrentSession();  
            } catch (org.hibernate.HibernateException he) {  
                sess = factory.openSession();     
            } 
            session=sess;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static CtrlDataFactoriaBD getInstance() {
        if (instance == null) {
            instance = new CtrlDataFactoriaBD();
        }
        return instance;
    }

    public Session getSession(){
        return session;
    }
    
    public void saveInstance(ArrayList<Object> ins){
        if (ins != null){
            if (ins.size()>0){
               //Session session = this.getSession();
                session.beginTransaction();
                for (int i = 0; i < ins.size(); i++){
                    session.save(ins.get(i));
                }
                session.getTransaction().commit();
            }
        }
    }
}
