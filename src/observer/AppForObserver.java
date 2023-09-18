package observer;

public class AppForObserver {
    public static void main(String[] args) throws InterruptedException {
        Channel channel = new Channel();

        Subscriber subscriber1 = new Subscriber("Tanvir1");
        Subscriber subscriber2 = new Subscriber("Tanvir2");
        Subscriber subscriber3 = new Subscriber("Tanvir3");


        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);
        channel.subscribe(subscriber3);
        


        for (int i = 0; i < 5; i++) {
            Thread.sleep(5000l);
            channel.upload("Test");
        }
        
    }
}
