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
        //cosas...
        boolean flag=false;
        try {
            InformesSanitat informesSanitat = new InformesSanitat();
            InformesSanitatPortType informesSanitatPT = informesSanitat.getInformesSanitatHttpSoap12Endpoint();
            GregorianCalendar calendar = new GregorianCalendar(TimeZone.getDefault());
            XMLGregorianCalendar da = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
            calendar.setTime(dataAvui);
            XMLGregorianCalendar dc = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
           
            flag = informesSanitatPT.enviarInformeIngres(nomEsp, da, nomHosp, numHab, nTS, dniMetge, emailPac);
            //b = true;
        } catch (DatatypeConfigurationException ex) {
        }
        return flag;
    }
    
}
