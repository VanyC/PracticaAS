
package PresentationLayer.PresentationController;
import DomainLayer.DomainController.CtrlIngressarPacient;
import DomainLayer.DomainModel.InfoHospital;
import DomainLayer.DomainModel.InfoMetge;
import java.util.ArrayList;

public class IngressarPacientController {
    
    private CtrlIngressarPacient CtrlIngPac;
    private IngressarPacientView IngPacView;
    private String nomEsp;
    private String nomHosp;
    private Integer numHab;
    private String nTs;
    private String metge;
    private String dniPacient;

    public void PrIngressarPacientObteHosp (String nomEsp) throws Exception {
                 
         try { 
              this.nomEsp = nomEsp;
              CtrlIngPac = new CtrlIngressarPacient();
              
              ArrayList<InfoHospital> hospitals = CtrlIngPac.obteHospitalsLliuresPerEspecialitat(nomEsp);
              IngPacView = new IngressarPacientView();
              IngPacView.mostrarHospitalsLliuresPerEspecialitat(hospitals);
         }
         catch (Exception e) {
            if (e.getMessage().equals("no hi ha especialitat")) IngPacView.mostrarMissatge("Aquesta especialitat no existeix.","principal");
            else if (e.getMessage().equals("no hi ha hospitals")) IngPacView.mostrarMissatge("No hi ha hospitals disponibles per aquesta especialitat.","principal");
         }         
    }

    public void PrContinuarHospitalsLliuresPerEspecialitat (String nomHosp, Integer numHab, String  nTS) throws Exception {

        try {
            this.nomHosp = nomHosp;
            this.numHab = numHab;
            this.nTs = nTs;
           
            CtrlIngPac = new CtrlIngressarPacient();
            CtrlIngPac.creaIngres(nomHosp,numHab,nTS);
            
            IngPacView = new IngressarPacientView();
            IngPacView.mostrarMissatgeAssignarMetge();
        }
        catch (Exception e) {
            if (e.getMessage().equals("pacient no existeix")) IngPacView.mostrarMissatge("El pacient no existeix.","IngPac1");
            else if (e.getMessage().equals("pacient ingressat")) IngPacView.mostrarMissatge("El pacient ja està ingressat.","IngPac1");
        }        
    }

    public void PrMissatgeAssignarMetge() throws Exception {    //Esta es la equivalente a PrSiMissatgeAssignarMetge() de la entrega2.

        try {
            CtrlIngPac = new CtrlIngressarPacient();
            ArrayList<InfoMetge> metges = CtrlIngPac.mostraMetgesPerEspecialitat();
            
            IngPacView = new IngressarPacientView();
            IngPacView.mostrarMetgesHospitalPerEspecialitat(metges);
        }
        catch (Exception e) {
            if (e.getMessage().equals("no hi ha metges")) IngPacView.mostrarMissatge("No hi ha metges que compleixin la condició.","Missatge");
            
        }
    }

    public void PrNoMissatgeAssignarMetge() {
        
        this.metge = null;
        
        IngPacView = new IngressarPacientView();
        IngPacView.mostrarConfirmarIngres(this.nomEsp,this.nomHosp,this.numHab,this.nTs,this.metge,this.dniPacient);
    }
    
    public void PrOkAssignarMetgeAIngres(String dni) throws Exception { 
            
        this.metge = null;
        
        try {
            this.metge = dni;
            
            CtrlIngPac = new CtrlIngressarPacient();
            CtrlIngPac.assignarMetgeAIngres(dni);
            
            IngPacView = new IngressarPacientView();
            IngPacView.mostrarConfirmarIngres(this.nomEsp,this.nomHosp,this.numHab,this.nTs,this.metge,this.dniPacient);
        }
        catch (Exception e) {
            if (e.getMessage().equals("IngrésAmbMetge")) IngPacView.mostrarMissatge("L'ingres ja té un metge assignat.","AssignarMetge");
            else if (e.getMessage().equals("DataIngrés")) IngPacView.mostrarMissatge("L'ingres ja té data d'alta.", "AssignarMetge");
        }
    }

    public void PrConfirmarCrearIngres() { 

        try {
            CtrlIngPac = new CtrlIngressarPacient();
            boolean correcte = CtrlIngPac.enviarInformeIngres();
            this.dniPacient = CtrlIngPac.obteDniPacient();                      // Esta es la funcion que faltaba por implementar.  
            
            IngPacView = new IngressarPacientView();
            IngPacView.mostrarMissatgeFinal(this.dniPacient);
        }
        catch (Exception e) {
            if (e.getMessage().equals("EnviarInformeIngres")) IngPacView.mostrarMissatge("El servei no està disponible.","ConfirmarAlta");
        }
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