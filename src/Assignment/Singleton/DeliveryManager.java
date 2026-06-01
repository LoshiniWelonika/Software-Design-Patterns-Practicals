package Assignment.Singleton;

public class DeliveryManager {

    private static DeliveryManager instance;

    private DeliveryManager() {}

    public static DeliveryManager getInstance() {

        if(instance == null) {
            instance = new DeliveryManager();
        }

        return instance;
    }

    public void trackDelivery(String orderId) {
        System.out.println("Tracking Order: " + orderId);
    }

    public void assignDriver(String driver) {
        System.out.println("Driver Assigned: " + driver);
    }

    public void updateStatus(String status) {
        System.out.println("Delivery Status: " + status);
    }
}
