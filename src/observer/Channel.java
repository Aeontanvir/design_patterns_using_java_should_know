package observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String title;


    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void notifySubscribers(){
        this.subscribers.forEach(subscriber->{
            subscriber.incommingUpdate(title);
        });
    }

    public void upload(String title){
        this.title = title;
        this.notifySubscribers();
    }
    
}
