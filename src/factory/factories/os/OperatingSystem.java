package factory.factories.os;

public abstract class OperatingSystem {
    private String version;
    private String architecture;

    

    public OperatingSystem(String version, String architecture) {
        this.version = version;
        this.architecture = architecture;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getArchitecture() {
        return architecture;
    }
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public abstract void changeDirectory(String dir);
    public abstract void removeDirectory(String dir);

    @Override
    public String toString() {
        return "OperatingSystem [version=" + version + ", architecture=" + architecture + "]";
    }


    
    
}
