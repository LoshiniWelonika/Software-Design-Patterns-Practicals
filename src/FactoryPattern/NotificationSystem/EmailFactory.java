package FactoryPattern.NotificationSystem;

class EmailFactory extends NotificationFactory{
    Notification createNotification(){
        return new EmailNotification();
    }   
}
