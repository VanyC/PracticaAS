package DomainLayer.DomainModel;

public class ServiceLocator {
    ServiceLocator instance;

    public ServiceLocator() {
        if (instance==null) instance=new ServiceLocator();
    }

    public ServiceLocator getInstance() {
        return instance;
    }
    
    public ServiceLocator find (String name){
        return instance;
    }
    
}
