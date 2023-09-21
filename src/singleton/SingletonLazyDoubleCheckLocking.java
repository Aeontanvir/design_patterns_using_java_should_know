package singleton;

public class SingletonLazyDoubleCheckLocking {

    private static SingletonLazyDoubleCheckLocking instance;
    
    private SingletonLazyDoubleCheckLocking(){}

    public static SingletonLazyDoubleCheckLocking getInstance(){
        if(instance == null){
            synchronized (SingletonLazyDoubleCheckLocking.class){
               if(instance == null){
                    instance = new SingletonLazyDoubleCheckLocking();
               } 
            }
        }
        return instance;
    }

}
