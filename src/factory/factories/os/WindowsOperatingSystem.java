package factory.factories.os;

class WindowsOperatingSystem extends OperatingSystem {



    protected WindowsOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDirectory(String dir) {

        System.out.println("WindowsOperatingSystem Directory Change");
    }

    @Override
    public void removeDirectory(String dir) {
        System.out.println("WindowsOperatingSystem Directory Remove");
    }

    @Override
    public String toString() {
        return "WindowsOperatingSystem  " + super.toString();
    }

    
    
}
