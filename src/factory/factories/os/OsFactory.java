package factory.factories.os;

public class OsFactory {

    private OsFactory() {

    }

    public static OperatingSystem getInstance(String type, String version, String architecture) {
        switch (type) {
            case "MAC":
                return new MacOperatingSystem(version, architecture);
            case "WINDOWS":
                return new WindowsOperatingSystem(version, architecture);
            case "LINUX":
                return new LinuxOperatingSystem(version, architecture);
            default:
                throw new IllegalArgumentException("OS Not supported");
        }
    }
}
