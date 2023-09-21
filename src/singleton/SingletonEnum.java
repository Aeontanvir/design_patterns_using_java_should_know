package singleton;

public enum SingletonEnum {
    INSTANCE;

    public void doSomething() {
        System.out.println("Singleton is doing something.");
    }
}
