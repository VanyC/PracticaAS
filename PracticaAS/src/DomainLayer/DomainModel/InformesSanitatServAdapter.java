/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Vane
 */
public class InformesSanitatServAdapter implements IInformesSanitatServAdapter {
    
    @Override
    public boolean enviarInformeIngres(String nomEsp, Date dataAvui, String nomHosp, int numHab, String nTS, String dniMetge, String emailPac) {
        
        boolean flag=false;
        try {
            InformesSanitat informesSanitat = (InformesSanitat) ServiceLocator.getInstance().find("SvInformesSanitat");
            InformesSanitatPortType informesSanitatPT = informesSanitat.getInformesSanitatHttpSoap12Endpoint();
            GregorianCalendar calendari = new GregorianCalendar(TimeZone.getDefault());
            XMLGregorianCalendar dataActual = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendari);
           
            flag = informesSanitatPT.enviarInformeIngres(nomEsp, dataActual, nomHosp, numHab, nTS, dniMetge, emailPac);

        } catch (DatatypeConfigurationException ex) {
        }
        return flag;
    }
    
}
