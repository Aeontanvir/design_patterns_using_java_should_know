package singleton;

public class SingletonBillPughSingleton {
    
    private SingletonBillPughSingleton(){}

    private static class InnerSingletonLazyBillPughSingleton {
       private static final SingletonBillPughSingleton INSTANCE = new SingletonBillPughSingleton(); 
    }

    public static SingletonBillPughSingleton getInstance(){
        return InnerSingletonLazyBillPughSingleton.INSTANCE;
    }
}
