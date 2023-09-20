package composite.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private String name;
    private List<Component> components = new ArrayList<>();

    

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println(name+": Show Price -------- ");
        components.forEach((item)->{
            item.showPrice(); 
        });
    }

    public List<Component> getComponents() {
        return components;
    }

    public void addComponent(Component component) {
        this.getComponents().add(component);
    }

    
    
}
