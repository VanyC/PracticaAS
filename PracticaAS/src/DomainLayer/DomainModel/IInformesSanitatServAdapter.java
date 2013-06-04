/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

import java.util.Date;

/**
 *
 * @author Vane
 */
public interface IInformesSanitatServAdapter {
    public boolean enviarInformeIngres(String nomEsp, Date dataAvui, String nomHosp, int numHab, String nTS, String dniMetge, String emailPac);
}
