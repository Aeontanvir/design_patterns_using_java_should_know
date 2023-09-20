package composite.composite;

public class Leaf implements Component{
    
    private String name;
    private int price;
    

    

    public Leaf(String name, int price ) {
        this.name = name;
        this.price = price;
        
    }



    @Override
    public void showPrice() {
        System.out.println(name + ":  Show Price = "+ price);
    }



    @Override
    public void addComponent(Component component) {
        throw new UnsupportedOperationException("Leaf can not add component");
    }
    
}
