

package PresentationLayer.PresentationController;
import DomainLayer.DomainModel.InfoHospital;
import DomainLayer.DomainModel.InfoMetge;
import PresentationLayer.IngressarPacient1;
import PresentationLayer.*;
import java.util.ArrayList;
import javax.swing.JTable;


public class IngressarPacientView {
    
    private IngressarPacientController IngPacContr;
    private IngressarPacient1 IngPac1;
    private JTable jTableH;
    private Principal princ;
    private Missatges missatge;
    private ConfirmarAlta confAlta;
    private AssignarMetge2 assignarMetge;
    
    public void especialitatClient(String nomEsp) throws Exception  {
        IngPacContr = new IngressarPacientController();
        IngPacContr.PrIngressarPacientObteHosp(nomEsp);
    }
    
    public void hospitalClient(String nomHosp, Integer num, String nTs) throws Exception {
        IngPacContr.PrContinuarHospitalsLliuresPerEspecialitat(nomHosp, num, nTs);
        
    }
    
    public void noMetgeClient() {
        IngPacContr.PrConfirmarCrearIngres();
    }
    
    public void siMetgeClient() throws Exception {
        IngPacContr.PrMissatgeAssignarMetge();
    }
    
    public void metgeClient(String dni) throws Exception {
        IngPacContr.PrOkAssignarMetgeAIngres(dni);
    }
    void mostrarHospitalsLliuresPerEspecialitat(ArrayList<InfoHospital> llistatHospitals) {
        princ.setVisible(false);
        IngPac1 = new IngressarPacient1();
        IngPac1.inicializarVista(llistatHospitals);
        IngPac1.setVisible(true);
          
    }

    void mostrarMissatgeAssignarMetge() {
        
         IngPac1.setVisible(false);
         missatge = new Missatges();
         missatge.inicializarMissatges();
         missatge.setVisible(true);
         
         
    }

    void mostrarMetgesHospitalPerEspecialitat(ArrayList<InfoMetge> llistatMetges) {
        missatge.setVisible(false);
        assignarMetge = new AssignarMetge2();
        assignarMetge.inicializarMetge(llistatMetges);
        assignarMetge.setVisible(true);
    }

    void mostrarConfirmarIngres() {
        missatge.setVisible(false);
        confAlta = new ConfirmarAlta();
        confAlta.inicializarConfirmarAlta();
        confAlta.setVisible(true);
    }

    void mostrarMissatgeFinal() {}

    public void mostrarMissatge(String txt, String vista) {
        if(vista.equals("principal")){
            princ.mostrarMissatge(txt);
        }
        else if(vista.equals("IngPac1")){
            IngPac1.mostrarMissatge(txt);
        }
        else if(vista.equals("Missatges")){
            missatge.mostrarMissatge(txt);
        }
        else if(vista.equals("ConfirmarAlta")){
            confAlta.mostrarMissatge(txt);
        }
    }
    
    public void tancar() {}
    
}