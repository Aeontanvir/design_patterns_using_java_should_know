package factory.factories.os;

class MacOperatingSystem extends OperatingSystem {



    protected MacOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDirectory(String dir) {

        System.out.println("MacOparetingSystem Directory Change");
    }

    @Override
    public void removeDirectory(String dir) {
        System.out.println("MacOparetingSystem Directory Remove");
    }

    @Override
    public String toString() {
        return "MacOperatingSystem  " + super.toString();
    }

    
    
}
