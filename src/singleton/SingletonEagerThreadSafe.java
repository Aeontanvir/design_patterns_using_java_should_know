package singleton;

public class SingletonEagerThreadSafe {

    private static final SingletonEagerThreadSafe INSTANCE = new SingletonEagerThreadSafe();
    
    private SingletonEagerThreadSafe(){}

    public static synchronized SingletonEagerThreadSafe getInstance(){
        return INSTANCE;
    }
}
