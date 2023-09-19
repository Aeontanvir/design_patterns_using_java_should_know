package decorator;

public class SportyDress extends DressDecorator {

    public SportyDress(Dress dress) {
        super(dress);
    }

    @Override
    public void assemble() {
        // TODO Auto-generated method stub
        super.assemble();
        System.out.println("Adding Sporty Dress Features");
    }

    
    
}