package FactoryPattern.NotificationSystem;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory;

        String type = "email";

        if(type.equalsIgnoreCase("email")){
            factory = new EmailFactory();
        }
        else{
            factory = new SMSFactory();
        }

        Notification notification = factory.createNotification();
        notification.send();
    }     
}
