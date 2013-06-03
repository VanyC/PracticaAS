/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaas.Domini;

/**
 *
 * @author Sandra
 */
public class Persona {
    private String dni;
    private String nom;
    
    public Pair<String,String> obteDadesPersona(){
        Pair<String,String> pair = new Pair<String,String>(this.dni,this.nom);
        return pair;
    }

    private static class Pair<T0, T1> {
        private final T0 a;
        private final T1 b;

        public Pair(T0 a, T1 b) {
            this.a = a;
            this.b = b;
        }
    }
}
