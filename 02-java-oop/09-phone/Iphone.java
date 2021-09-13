public class Iphone extends Phone implements Ringable {

    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String Ring() {
        return this.getRingTone();
    }

    @Override
    public String unlock() {
        return "Unlock with fingerprint scanner";
    }

    @Override
    public void displayInfo() {
        System.out.println("Version Number: " + this.getVersionNumber());
        System.out.println("Battery Percentage:" + this.getBatteryPercentage());
        System.out.println("Carrier:" + this.getCarrier());
        System.out.println("RingTone:" + this.getRingTone());
    }
}