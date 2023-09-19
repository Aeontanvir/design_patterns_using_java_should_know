package decorator;

public class FancyDress extends DressDecorator {

    public FancyDress(Dress dress) {
        super(dress);
    }

    @Override
    public void assemble() {
        // TODO Auto-generated method stub
        super.assemble();
        System.out.println("Adding Fancy Dress Features");
    }

    
    
}