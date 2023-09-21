package singleton;

public class SingletonLazyThreadSafe {

    private static SingletonLazyThreadSafe instance;
    
    private SingletonLazyThreadSafe(){}

    public static synchronized SingletonLazyThreadSafe getInstance(){
        if(instance == null){
            return new SingletonLazyThreadSafe();
        }
        return instance;
    }
}
