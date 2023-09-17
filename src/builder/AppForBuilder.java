package builder;

import builder.phone.Phone;
import builder.phone.PhoneBuilder;

public class AppForBuilder {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setOs("Android").setRam(8).setScreenSize(5.5).setBattery(5000).getPHone();
        System.out.println(phone);
        
    }
}
