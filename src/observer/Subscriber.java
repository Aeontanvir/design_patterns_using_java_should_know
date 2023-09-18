package observer;

public class Subscriber {
    private String name;
    private Channel channel = new Channel();

    

    public Subscriber(String name) {
        this.name = name;
    }

    public void incommingUpdate(String title){
        System.out.println(name +": New Incomming Update!"+" Updated Title: "+ title);
    }

    public void subscribeChannel(Channel channel){
        this.channel = channel;
    }

    
    
}
