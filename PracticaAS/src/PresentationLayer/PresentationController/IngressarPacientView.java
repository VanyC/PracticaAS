
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
    private ConfirmarAlta confAlt;
    private Misatge2 misFinal;
    
    //Funciones que son llamadas desde las vistas. Estas funciones envian al IngressarPacientController los datos que ha introducido el usuario en las vistas.
    
    public void especialitatClient(String nomEsp) throws Exception  {
        IngPacContr = new IngressarPacientController();
        IngPacContr.PrIngressarPacientObteHosp(nomEsp);
    }
    
    public void hospitalClient(String nomHosp, Integer num, String nTs) throws Exception {
        IngPacContr.PrContinuarHospitalsLliuresPerEspecialitat(nomHosp, num, nTs);
    }
    
    public void noMetgeClient() {
        IngPacContr.PrNoMissatgeAssignarMetge();
    }
    
    public void siMetgeClient() throws Exception {
        IngPacContr.PrMissatgeAssignarMetge();
    }
    
    public void metgeClient(String dni) throws Exception {
        IngPacContr.PrOkAssignarMetgeAIngres(dni);
    }
    
    public void confirmacioDadesClient() {
        IngPacContr.PrConfirmarCrearIngres();
    }
    
    //Funciones que son llamadas desde IngressarPacientController.
    
    void mostrarHospitalsLliuresPerEspecialitat(ArrayList<InfoHospital> llistatHospitals) { // Hace invisible la pantalla de la que venimos
        princ.setVisible(false);                                                            // y hace visible la pantalla a la que vamos.
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

    void mostrarConfirmarIngres(String nomEsp,String nomHosp, Integer numHab, String nTs, String metge, String dniPacient) {
        missatge.setVisible(false);
        assignarMetge.setVisible(false);
        confAlta = new ConfirmarAlta();
        confAlta.inicializarConfirmarAlta(nomEsp,nomHosp,numHab,nTs,metge,dniPacient);
        confAlta.setVisible(true);
    }

    public void mostrarMissatgeFinal(String dniPacient) {
        confAlta.setVisible(false);
        misFinal = new Misatge2();
        misFinal.inicializarMissatgeFinal(dniPacient);
        misFinal.setVisible(true);
    }

    public void mostrarMissatge(String txt, String vista) {  // Rellena el campo "Text de l'error" de la vista "vista".
        if(vista.equals("principal")){
            princ.mostrarMissatge(txt);
        }
        else if(vista.equals("IngPac1")){
            IngPac1.mostrarMissatge(txt);
        }
        else if(vista.equals("Missatge")){
            missatge.mostrarMissatge(txt);
        }
        else if(vista.equals("AssignarMetge")){
            assignarMetge.mostrarMissatge(txt);
        }
        else if(vista.equals("ConfirmarAlta")){
            confAlta.mostrarMissatge(txt);
        }
    }
    
    public void tancar() {}
}