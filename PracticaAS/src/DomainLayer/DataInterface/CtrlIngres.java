/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DataInterface;

import java.util.Date;
import DomainLayer.DomainModel.Ingres;

/**
 *
 * @author Roberto
 */
public interface CtrlIngres {
    public Ingres getIngres(String nTs, Date date);
}

