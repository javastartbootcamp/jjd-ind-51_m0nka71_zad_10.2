package pl.javastart.task;

public class PhoneSubscriptionContract extends PhoneContract  {

    public PhoneSubscriptionContract(double smsPrice, double mmsPrice, double callPrice) {
        super(smsPrice, mmsPrice, callPrice);
    }

    @Override
    public boolean sendSms() {
        smsCounter++;
        return true;
    }

    @Override
    public boolean call() {
        return true;
    }

    @Override
    public boolean sendMms() {
        mmsCounter++;
        return true;
    }

    @Override
    public void printStatus() {
        System.out.println("=== STAN KONTA ===");
        System.out.println("Wysłanych SMSów: " + smsCounter);
        System.out.println("Wysłanych MMSów: " + mmsCounter);
        System.out.println("Liczba sekund rozmowy: " + secondsCounter);
        System.out.print("\n\n");
    }
}
