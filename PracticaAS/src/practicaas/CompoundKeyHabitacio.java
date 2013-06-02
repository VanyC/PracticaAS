/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaas;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Vane
 */
@Embeddable
public class CompoundKeyHabitacio implements Serializable { //al hacer guardar se puede transformar en 1 i 0

    @Column(name="numero")
    private String numero;
    @Column(name="hospitalNom")
    private String hospitalNom;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String gethospitalNom() {
        return hospitalNom;
    }

    public void sethospitalNom(String nom) {
        this.hospitalNom = nom;
    }

    public CompoundKeyHabitacio(String numero, String nom) {
        this.numero = numero;
        this.hospitalNom = nom;
    }
    
    public CompoundKeyHabitacio() {
    }
    
}
