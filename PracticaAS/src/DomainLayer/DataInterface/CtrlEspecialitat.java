/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DataInterface;

import DomainLayer.DomainModel.Especialitat;
/**
 *
 * @author Roberto
 */
public interface CtrlEspecialitat {
    public Especialitat getEspecialitat(String nomEsp);
    public Boolean existeixEspecialitat(String nomEsp);
}
