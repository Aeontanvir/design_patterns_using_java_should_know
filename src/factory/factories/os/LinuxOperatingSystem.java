package factory.factories.os;

class LinuxOperatingSystem extends OperatingSystem {



    protected LinuxOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDirectory(String dir) {

        System.out.println("LinuxOperatingSystem Directory Change");
    }

    @Override
    public void removeDirectory(String dir) {
        System.out.println("LinuxOperatingSystem Directory Remove");
    }

    @Override
    public String toString() {
        return "LinuxOperatingSystem "+super.toString();
    }



    
    
    
}
