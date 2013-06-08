package DomainLayer.DomainModel;

public class ServiceLocator {
    static ServiceLocator instance;

    public ServiceLocator() {
        
    }

    public static ServiceLocator getInstance() {
        if (instance == null) instance = new ServiceLocator();
        return instance;
    }
    
    public Object find (String name){
        if (name.equals("SvInformesSanitat")) return new InformesSanitat();
        else return null;
    }
    
}
