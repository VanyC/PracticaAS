/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

import java.util.ArrayList;

/**
 *
 * @author Sandra
 */
public class Pacient extends Persona{
    private String nTS;
    private String email;
    private ArrayList<Ingres> ingres;
    
    public String getEmail(){
        return email;
    }
}
