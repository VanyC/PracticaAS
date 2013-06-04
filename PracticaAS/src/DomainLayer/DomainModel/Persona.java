/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

/**
 *
 * @author Sandra
 */
public class Persona {
    private String dni;
    private String nom;
    
    public Pair<String,String> obteDadesPersona(){
        Pair<String,String> dp = new Pair<String,String>(this.dni,this.nom);
        return dp;
    }

    private static class Pair<T0, T1> {
        private final String dni;
        private final String nom;

        public Pair(String dni, String nom) {
            this.dni = dni;
            this.nom = nom;
        }   
        
    }
}
