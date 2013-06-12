
package PresentationLayer.PresentationController;

import DomainLayer.DomainController.CtrlIngressarPacient;
import DomainLayer.DomainModel.InfoHospital;
import DomainLayer.DomainModel.InfoMetge;
import java.util.ArrayList;

public class IngressarPacientController {
    private CtrlIngressarPacient CtrlIngPac;
    private IngressarPacientView IngPacView;
    

    public void PrIngressarPacientObteHosp (String nomEsp) throws Exception {
         
        
         CtrlIngPac = new CtrlIngressarPacient();
  
         try {
              // La funcion obteHospitalsLliuresPerEspecialitat(nomEsp) peta.
              ArrayList<InfoHospital> hospitals = CtrlIngPac.obteHospitalsLliuresPerEspecialitat(nomEsp);
              IngPacView = new IngressarPacientView();
              IngPacView.mostrarHospitalsLliuresPerEspecialitat(hospitals);
         }
         catch (Exception e) {
            if (e.getMessage().equals("NoHiHaEspecialitat")) IngPacView.mostrarMissatge("Aquesta especialitat no existeix.","principal");
            else if (e.getMessage().equals("NoHiHaHospitals")) IngPacView.mostrarMissatge("No hi ha hospitals disponibles per aquesta especialitat.","principal");
         }         
    }

    public void PrContinuarHospitalsLliuresPerEspecialitat (String nomHosp, Integer numHab, String  nTS) throws Exception {

        try {
            CtrlIngPac = new CtrlIngressarPacient();
            CtrlIngPac.creaIngres(nomHosp,numHab,nTS);
            IngPacView = new IngressarPacientView();
            IngPacView.mostrarMissatgeAssignarMetge();
        }
        catch (Exception e) {
            if (e.getMessage().equals("PacientNoExisteix")) IngPacView.mostrarMissatge("El pacient no existeix.","IngPac1");
            else if (e.getMessage().equals("PacientIngressat")) IngPacView.mostrarMissatge("El pacient ja està ingressat.","IngPac1");
        }
        
    }

    public void PrMissatgeAssignarMetge() throws Exception {

        try {
            CtrlIngPac = new CtrlIngressarPacient();
            ArrayList<InfoMetge> metges = CtrlIngPac.mostraMetgesPerEspecialitat();
            IngPacView = new IngressarPacientView();
            IngPacView.mostrarMetgesHospitalPerEspecialitat(metges);
        }
        catch (Exception e) {
            if (e.getMessage().equals("NoHiHaMetges")) IngPacView.mostrarMissatge("No hi ha metges que compleixin la condició.","Missatge");
            
        }
    }

    public void PrOkAssignarMetgeAIngres(String dni) throws Exception {

        try {
            CtrlIngPac = new CtrlIngressarPacient();
            CtrlIngPac.assignarMetgeAIngres(dni);
            IngPacView = new IngressarPacientView();
            IngPacView.mostrarConfirmarIngres();
        }
        catch (Exception e) {
            if (e.getMessage().equals("IngresAmbMetge")) IngPacView.mostrarMissatge("L'ingres ja té un metge assignat.","AssignarMetge");
            else if (e.getMessage().equals("DataIngres")) IngPacView.mostrarMissatge("L'ingres ja té data d'alta.", "AssignarMetge");
        }
    }

    public void PrConfirmarCrearIngres() { //Falta

        try {
            CtrlIngPac = new CtrlIngressarPacient();
            boolean correcte = CtrlIngPac.enviarInformeIngres();
            IngPacView = new IngressarPacientView();
            IngPacView.mostrarMissatgeFinal();
        }
        catch (Exception e) {
            if (e.getMessage().equals("ServeiNoDisponible")) IngPacView.mostrarMissatge("El servei no està disponible.","f");
        }
    }

    public void PrNoMissatgeAssignarMetge() {

        CtrlIngPac = new CtrlIngressarPacient();
        boolean correcte = CtrlIngPac.enviarInformeIngres();

        IngPacView = new IngressarPacientView();
    }

    public void PrSortir() {

        IngPacView = new IngressarPacientView();
        IngPacView.tancar();

    }
    
    public void PrCancel() {

        IngPacView = new IngressarPacientView();
        IngPacView.tancar();
    }
        
}