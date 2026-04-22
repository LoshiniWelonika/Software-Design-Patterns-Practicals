package AbstractPattern;

public class Main {
    public static void main(String[] args) {
        OldCharger oldcharger = new OldCharger();

        Charger charger = new ChargerAdapter(oldcharger);

        charger.charge(); 
    }
    
}
