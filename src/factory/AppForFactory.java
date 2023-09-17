package factory;

import factory.factories.os.OperatingSystem;
import factory.factories.os.OsFactory;

public class AppForFactory {
    public static void main(String[] args) {
        OperatingSystem os = OsFactory.getInstance("MAC", "2.1.1", "Opensource");

        System.out.println(os);
    }
}
