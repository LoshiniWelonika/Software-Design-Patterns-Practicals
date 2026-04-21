package FactoryPattern.NotificationSystem;

public class WhatsappFactory extends NotificationFactory {
      Notification createNotification() {
            return new WhatsappNotification();
    }
}
