package FactoryPattern.NotificationSystem;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory;

        String type = "Whatsapp";

        if(type.equalsIgnoreCase("email")){
            factory = new EmailFactory();
        }
        else if (type.equalsIgnoreCase("sms")){
            factory = new SMSFactory();
        }
        else{
            factory = new WhatsappFactory();
        }

        Notification notification = factory.createNotification();
        notification.send();
    }     
}
