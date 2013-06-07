/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

/**
 *
 * @author Roberto
 */
public class Factoria {
    
    private static Factoria instance = null;
    IInformesSanitatServAdapter iss;
    
    private Factoria() {
        
    }
    
    public static Factoria getInstance() {
        if (instance == null) {
            instance = new Factoria();
        }
        return instance;
    }
    
    public IInformesSanitatServAdapter getInformeSanitatServ(){
        if (iss == null){
            iss = new InformesSanitatServAdapter();
        }
        return iss;
    }
}
