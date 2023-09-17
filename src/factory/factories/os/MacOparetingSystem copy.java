package factory.factories.os;

class MacOparetingSystem extends OperatingSystem {



    public MacOparetingSystem(String version, String architecture) {
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
    
}
