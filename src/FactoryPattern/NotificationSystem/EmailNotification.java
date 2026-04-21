package FactoryPattern.NotificationSystem;

public class EmailNotification implements Notification {
    public void send(){
        System.out.println("Sending Email Notifications");
    }

}
