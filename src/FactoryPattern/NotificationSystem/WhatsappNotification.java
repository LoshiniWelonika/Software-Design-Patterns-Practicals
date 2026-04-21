package FactoryPattern.NotificationSystem;

public class WhatsappNotification implements Notification{
    public void send() {
        System.out.println("Sending Whatsapp Notification");
    }
}
