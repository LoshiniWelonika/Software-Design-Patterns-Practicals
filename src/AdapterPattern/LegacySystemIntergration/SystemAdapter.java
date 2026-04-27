package AbstractPattern.LegacySystemIntergration;

public class SystemAdapter implements ModernSystem{
    private LegacySystem legacy;

    public SystemAdapter(LegacySystem legacy){
        this.legacy = legacy;
    }
    
    public void request(){
        legacy.specificRequest();
    }
}
