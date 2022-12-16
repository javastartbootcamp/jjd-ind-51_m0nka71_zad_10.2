package pl.javastart.task;

public class Phone implements PhoneUtils {
    private double balanceCounter;
    private int smsCounter;
    private int mmsCounter;
    private int secondsCounter;
    private PhoneContract phoneContract;

    public Phone(PhoneContract phoneContract) {
        this.phoneContract = phoneContract;
    }

    @Override
    public void sendSms() {
        if (phoneContract.getBalance() >= phoneContract.getSmsPrice()) {
            System.out.println("SMS wysłany\n");
            balanceCounter = phoneContract.getBalance() - phoneContract.getSmsPrice();
            smsCounter++;
        } else {
            System.out.println("Nie udało się wysłać SMSa\n");
        }
    }

    @Override
    public void call(int seconds) {
        if (phoneContract.getBalance() >= ((seconds / 60) * phoneContract.getOneMinuteCallPrice())) {
            System.out.println("Rozmowa trwała: " + seconds + " sekund \n");
            secondsCounter = seconds;
        } else {
            System.out.println("Rozmowa przerwana, brak środków\n");
        }
    }

    @Override
    public void sendMms() {
        if (phoneContract.getBalance() >= phoneContract.getMmsPrice()) {
            System.out.println("MMS wysłany\n");
            mmsCounter++;
        } else {
            System.out.println("Nie udało się wysłać MMSa\n");
        }
    }

    @Override
    public void printAccountState() {
        System.out.println("=== STAN KONTA ===");
        System.out.println("Wysłanych SMSów: " + smsCounter);
        System.out.println("Wysłanych MMSów: " + mmsCounter);
        System.out.println("Liczba sekund rozmowy: " + secondsCounter);
        System.out.println("Na koncie zostało: " + phoneContract.getBalance() + " zł");
        System.out.print("\n\n");
    }
}
