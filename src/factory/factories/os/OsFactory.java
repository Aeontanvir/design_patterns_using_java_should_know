package factory.factories.os;

public class OsFactory {

    private OsFactory() {

    }

    public static OperatingSystem getInstance(String type, String version, String architecture) {
        switch (type) {
            case "MAC":
                return new MacOparetingSystem(version, architecture);
            default:
                throw new IllegalArgumentException("OS Not supported");
        }
    }
}
