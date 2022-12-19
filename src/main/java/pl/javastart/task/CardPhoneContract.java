package pl.javastart.task;

public class CardPhoneContract extends PhoneContract {

    protected double balance;

    public CardPhoneContract(double balance, double smsPrice, double mmsPrice, double callPrice) {
        super(smsPrice, mmsPrice, callPrice);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean sendSms() {
        if (balance >= smsPrice) {
            balance = balance - smsPrice;
            smsCounter++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean call() {
        if (balance >= callPrice) {
            balance = balance - (callPrice / 60);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean sendMms() {
        if (balance >= mmsPrice) {
            balance = balance - mmsPrice;
            mmsCounter++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void printStatus() {
        System.out.println("=== STAN KONTA ===");
        System.out.println("Wysłanych SMSów: " + smsCounter);
        System.out.println("Wysłanych MMSów: " + mmsCounter);
        System.out.println("Liczba sekund rozmowy: " + secondsCounter);
        System.out.printf("Na koncie zostało: %.2f zł", balance);
        System.out.print("\n\n");
    }
}
