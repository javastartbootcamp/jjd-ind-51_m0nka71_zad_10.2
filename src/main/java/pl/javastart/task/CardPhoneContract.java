package pl.javastart.task;

public class CardPhoneContract extends PhoneContract {

    public CardPhoneContract(double balance, double smsPrice, double mmsPrice, double oneMinuteCallPrice) {
        super(balance, smsPrice, mmsPrice, oneMinuteCallPrice);
    }
}
